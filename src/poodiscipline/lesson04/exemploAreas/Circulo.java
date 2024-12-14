package poodiscipline.lesson04.exemploAreas;

public class Circulo extends Figures{
    public double raio;

    @Override
    public double calcularArea() {
        return PI*(raio * raio);
    }
}
