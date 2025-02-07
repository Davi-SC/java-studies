package poodiscipline.listaoexercicios;

class Veiculo {
    private String modelo;
    private String marca;
    private boolean status;
    public void ligar(){
        setStatus(true);
        System.out.println("Veiculo Ligado ...");
    }
    public void desligar(){
        setStatus(false);
        System.out.println("Veiculo Desligado ...");
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", status=" + status +
                '}';
    }
}
class Carro extends Veiculo{
    private int numPortas;
    @Override
    public void ligar(){
        setStatus(true);
        System.out.println("Carro Ligado ...");
    }
    @Override
    public void desligar(){
        setStatus(false);
        System.out.println("Carro Desligado ...");
    }

    public Carro(String modelo,String marca,int numPortas) {
        setModelo(modelo);
        setMarca(marca);
        this.numPortas = numPortas;
    }

}
class Moto extends Veiculo{
    private int cilindradas;
    @Override
    public void ligar(){
        setStatus(true);
        System.out.println("Moto Ligada ...");
    }
    @Override
    public void desligar(){
        setStatus(false);
        System.out.println("Moto Desligada ...");
    }

    public Moto(String modelo,String marca,int cilindradas) {
        setModelo(modelo);
        setMarca(marca);
        this.cilindradas = cilindradas;
    }
}

public class Questao7{
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[4];
        veiculos[0] = new Carro("Sienna", "Fiat", 4);
        veiculos[1] = new Carro("Gol Bola", "Wolkswagem", 4);
        veiculos[2] = new Moto("GS1200", "BMW", 1250);
        veiculos[3] = new Moto("Biz", "Honda", 125);

        for(int i =0; i<veiculos.length ; i++){
            veiculos[i].ligar();
            System.out.println(veiculos[i].toString());
        }
        for(int i =0; i<veiculos.length ; i++){
            veiculos[i].desligar();
            System.out.println(veiculos[i].toString());
        }

    }
}
