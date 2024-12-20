package poodiscipline.desafio02.zoologico;

public class Funcionario {
    private int id;
    private String nome;
    private String especialidade;
    static int totalFuncionarios = 0;

    public void cuidarAnimal(Animal animal){
        System.out.println("[ Nome: "+animal.getNome()+", ID: "+animal.getId()+", Especie: "+animal.getEspecie()+"]");
    }

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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
