package poodiscipline.desafio02.zoologico;

public class Funcionario {
    int id;
    String nome;
    String especialidade;

    public void cuidarAnimal(Animal animal){
        System.out.println("Funcionario "+nome+" esta cuidado do "+animal.nome);
    }

}
