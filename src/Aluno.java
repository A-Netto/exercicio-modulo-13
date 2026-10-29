public class Aluno {

    private String nome;
    private double[] notas;

    // Construtor
    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Metodo para calcular a media
    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / notas.length;

        return media;
    }
}

