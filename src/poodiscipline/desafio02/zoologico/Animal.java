package poodiscipline.desafio02.zoologico;

public abstract class Animal {

    private int id;
    private String nome;
    private String especie;
    static int totalAnimais = 0;

    abstract void emitirSom();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
