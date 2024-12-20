package poodiscipline.desafio02.zoologico;

public class Reptil extends Animal{
    double temperaturaCorporal;

    @Override
    void emitirSom() {
        System.out.println("tstststs");
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }
}
