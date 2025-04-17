public class Main {                                            
    public static void main(String[] args) {
        Mamifero leao = new Mamifero("Leão", Habitat.TERRESTRE, 5, "Dourada");
        Ave papagaio = new Ave("Papagaio", Habitat.AEREO, 2, "Verde");

        leao.emitirSom();                                      
        leao.mover();                                          
        leao.exibirDetalhes();                                

        System.out.println();                                  

        papagaio.emitirSom();                                  
        papagaio.mover();                                    
        papagaio.exibirDetalhes();                             
    }
}
