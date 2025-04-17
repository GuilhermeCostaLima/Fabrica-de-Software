public class Mamifero extends AnimalBase {                     
    private String pelagem;

    public Mamifero(String nome, Habitat habitat, int idade, String pelagem) {
        super(nome, habitat, idade);
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite som de mamífero.");
    }

    @Override
    public void mover() {                                     
        System.out.println(nome + " se move caminhando.");     
    }

    @Override
    public void exibirDetalhes() {                             
        System.out.println("Mamífero: " + nome + ", Idade: " + getIdade() + 
            ", Pelagem: " + pelagem + ", Habitat: " + habitat);
    }
}
