public class Celular {

    String marca;
    String modelo;
    int bateria;
    boolean ligado;
    double armazenamentoUsado;
    double armazenamentoTotal;

    void ligar() {
        if (bateria > 0) {
            ligado = true;
            System.out.println("Celular ligado.");
        } else {
            System.out.println("Bateria insuficiente.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println("Celular desligado.");
    }

    void carregarBateria(int percentual) {
        bateria += percentual;

        if (bateria > 100) {
            bateria = 100;
        }

        System.out.println("Bateria carregada.");
    }

    void usarArmazenamento(double gb) {

        if (armazenamentoUsado + gb <= armazenamentoTotal) {
            armazenamentoUsado += gb;
            System.out.println("Armazenamento utilizado.");
        } else {
            System.out.println("Espaço insuficiente.");
        }
    }

    void exibirStatus() {
        System.out.println(marca + " " + modelo + " — " + (ligado ? "LIGADO" : "DESLIGADO"));
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Armazenamento: " + armazenamentoUsado +
                " GB / " + armazenamentoTotal + " GB usados");
    }

    public static void main(String[] args) {

        Celular cel = new Celular();

        cel.marca = "Samsung";
        cel.modelo = "Galaxy A54";
        cel.bateria = 15;
        cel.ligado = false;
        cel.armazenamentoUsado = 50.0;
        cel.armazenamentoTotal = 128.0;

        cel.ligar();
        cel.carregarBateria(85);
        cel.usarArmazenamento(20.0);

        cel.exibirStatus();
    }
}