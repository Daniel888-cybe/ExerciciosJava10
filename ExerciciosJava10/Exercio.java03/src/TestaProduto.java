
public class TestaProduto {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Caneta Azul";
        produto.preco = 2.50;
        produto.quantidadeEstoque = 100;

        produto.exibirInformacoes();

        System.out.println("--- Vendendo 30 unidades ---");
        produto.vender(30);
        produto.exibirInformacoes();

        System.out.println("--- Tentando vender 200 unidades ---");
        produto.vender(200);

        System.out.println("--- Tentando vender quantidade inválida ---");
        produto.vender(-5);

        System.out.println("--- Repondo 50 unidades ---");
        produto.repor(50);
        produto.exibirInformacoes();
    }
}