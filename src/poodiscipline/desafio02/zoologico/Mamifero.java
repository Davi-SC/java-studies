package poodiscipline.desafio02.zoologico;

public class Mamifero extends Animal{
    private int tempoGestacao;

    @Override
    void emitirSom() {
        System.out.println("Muuu");
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
