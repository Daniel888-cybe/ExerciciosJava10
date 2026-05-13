//NOME:DANIEL ANDRADE LOPES
//RA:1261946795


public class Pet {

    String nome;
    String especie;
    String raca;
    int idade;
    double peso;

    void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", sou um " + especie + " da raça " + raca + ".");
        System.out.println("Tenho " + idade + " anos e peso " + peso + " kg.");
    }

    void aniversario() {
        idade++;
        System.out.println("Feliz aniversário, " + nome + "! Agora tem " + idade + " anos.");
    }

    void avaliarPeso(double pesoIdeal) {
        if (peso < pesoIdeal) {
            System.out.println(nome + " está abaixo do peso ideal (" + pesoIdeal + " kg).");
        } else if (peso == pesoIdeal) {
            System.out.println(nome + " está no peso ideal (" + pesoIdeal + " kg).");
        } else {
            System.out.println(nome + " está acima do peso ideal (" + pesoIdeal + " kg).");
        }
    }
}