import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE ALUNOS ===");

        // Quantidade de alunos
        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt();

        while (quantidadeAlunos <= 0) {
            System.out.println("Digite uma quantidade maior que zero:");
            quantidadeAlunos = scanner.nextInt();
        }

        scanner.nextLine();

        // Vetor para guardar os alunos
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        // Cadastro dos alunos
        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println("\nCadastro do aluno " + (i + 1));

            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade de notas: ");
            int quantidadeNotas = scanner.nextInt();

            while (quantidadeNotas <= 0) {
                System.out.println("Digite uma quantidade maior que zero:");
                quantidadeNotas = scanner.nextInt();
            }

            // Vetor para guardar as notas
            double[] notas = new double[quantidadeNotas];

            // Cadastro das notas
            for (int j = 0; j < quantidadeNotas; j++) {

                System.out.print("Digite a nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();

                // Validacao da nota
                while (nota < 0 || nota > 10) {
                    System.out.println("Nota invalida! Digite uma nota entre 0 e 10:");
                    nota = scanner.nextDouble();
                }

                notas[j] = nota;
            }

            scanner.nextLine();

            // Criando o objeto Aluno
            alunos[i] = new Aluno(nome, notas);
        }

        // Exibindo os resultados
        System.out.println("\n=== RESULTADO FINAL ===");

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println("\nAluno: " + alunos[i].getNome());

            System.out.println("Notas:");

            double[] notas = alunos[i].getNotas();

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[j]);
            }

            System.out.println("Media: " + alunos[i].calcularMedia());
        }

        scanner.close();
    }
}
