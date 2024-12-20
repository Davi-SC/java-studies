package poodiscipline.desafio02.zoologico;

public class Ave extends Animal {
    private String tipoPenas;

    @Override
    void emitirSom() {
        System.out.println("Bem te vi");
    }

    public String getTipoPenas() {
        return tipoPenas;
    }

    public void setTipoPenas(String tipoPenas) {
        this.tipoPenas = tipoPenas;
    }
}
