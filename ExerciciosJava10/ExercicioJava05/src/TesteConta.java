public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Carlos Souza";
        conta.NumeroConta = "0042-7";
        conta.saldo = 0;

        conta.depositar(1500.00);
        conta.depositar(250.00);
        conta.sacar(300.00);
        
        conta.exibirExtrato();

    }
}
