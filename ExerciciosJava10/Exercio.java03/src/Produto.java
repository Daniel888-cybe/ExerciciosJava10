// Nome: Daniel Andrade Lopes
// Matrícula: 1261946795

public class Produto {

    String nome;
    double preco;
    int quantidadeEstoque;

    void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }
        if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente. Disponível: " + quantidadeEstoque);
            return;
        }
        quantidadeEstoque -= quantidade;
        System.out.println("Venda realizada! Estoque restante: " + quantidadeEstoque + " unidades.");
    }

    void repor(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para reposição.");
            return;
        }
        quantidadeEstoque += quantidade;
        System.out.println("Estoque reposto! Novo estoque: " + quantidadeEstoque + " unidades.");
    }

    double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }

    void exibirInformacoes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidadeEstoque + " unidades");
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }
}

      
      
     
      
    