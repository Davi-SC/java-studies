package poodiscipline.desafio02.zoologico;

public class Mamifero extends Animal{
    int tempoGestacao;

    @Override
    void emitirSom() {
        System.out.println("Muuu");
    }
}
