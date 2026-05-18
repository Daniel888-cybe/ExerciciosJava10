//NOME:DANIEL ANDRADE LOPES
//RA:1261946795

public class Filme {

    String titulo;
    String diretor;
    int anoLancamento;
    int duracao;
    double nota;

    void exibirDetalhes() {
        System.out.println("Título: " + titulo + " (" + anoLancamento + ")");
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoFormatada());
        System.out.println("Nota: " + nota + " ★");

        if (recomendado()) {
            System.out.println("Recomendado: SIM");
        } else {
            System.out.println("Recomendado: NÃO");
        }
    }

    String duracaoFormatada() {
        int horas = duracao / 60;
        int minutos = duracao % 60;

        return horas + "h " + minutos + "m";
    }

    boolean recomendado() {
        return nota >= 7.0;
    }

    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.titulo = "Interestelar";
        filme.diretor = "Christopher Nolan";
        filme.anoLancamento = 2014;
        filme.duracao = 169;
        filme.nota = 9.2;

        filme.exibirDetalhes();
    }
}