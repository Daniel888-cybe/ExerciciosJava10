
public class Carro {

    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;

    void acelerar(double valor) {
        velocidadeAtual += valor;
    }

    void frear(double valor) {
        velocidadeAtual -= valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    void exibirDados() {
        System.out.println("Marca: " + marca +
                " | Modelo: " + modelo +
                " | Ano: " + ano +
                " | Velocidade: " + velocidadeAtual + " km/h");
    }
}