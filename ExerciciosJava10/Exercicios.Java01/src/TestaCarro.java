//NOME:DANIEL ANDRADE LOPES 
//RA:1261946795

public class TestaCarro {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.ano = 2019;

        meuCarro.acelerar(40);
        meuCarro.acelerar(20);

        meuCarro.exibirDados();

        meuCarro.frear(25);

        meuCarro.exibirDados();
    }
}