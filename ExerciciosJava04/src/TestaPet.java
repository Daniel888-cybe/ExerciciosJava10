

public class TestaPet {

    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.nome = "Rex";
        pet.especie = "cachorro";
        pet.raca = "Labrador";
        pet.idade = 3;
        pet.peso = 28.5;

        System.out.println("=== Apresentação ===");
        pet.apresentar();

        System.out.println("\n=== Avaliação de Peso ===");
        pet.avaliarPeso(30.0); // abaixo do peso
        pet.avaliarPeso(28.5); // no peso ideal
        pet.avaliarPeso(20.0); // acima do peso

        System.out.println("\n=== Aniversário ===");
        pet.aniversario();
        pet.apresentar();
    }
}
