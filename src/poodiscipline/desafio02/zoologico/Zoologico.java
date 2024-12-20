package poodiscipline.desafio02.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    List<Animal> animais = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();

    void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    void cuidarAnimais(){
        for(Funcionario funcionario:funcionarios){
            String especialidade = funcionario.getEspecialidade().toLowerCase();
            if (especialidade.equals("cuidador de reptil")){
                System.out.println("Funcionario "+funcionario.getNome()+" esta cuidando dos repteis");
                for(Animal animal:animais){
                    if(animal instanceof Reptil){
                        funcionario.cuidarAnimal(animal);
                    }
                }
            } else if (especialidade.equals("cuidador de mamifero")){
                System.out.println("Funcionario "+funcionario.getNome()+" esta cuidando dos mamiferos");
                for(Animal animal:animais){
                    if(animal instanceof Mamifero){
                        funcionario.cuidarAnimal(animal);
                    }
                }
            } else if (especialidade.equals("cuidador de ave")){
                System.out.println("Funcionario "+funcionario.getNome()+" esta cuidando das aves");
                for(Animal animal:animais){
                    if(animal instanceof Ave){
                        funcionario.cuidarAnimal(animal);
                    }
                }
            } else if (especialidade.equals("veterinario")){
                System.out.println("Funcionario "+funcionario.getNome()+" é veterinario apto a cuidar de todos os animais");

            }else{
                System.out.println("Funcionario "+funcionario.getNome()+" é "+funcionario.getEspecialidade()+" e não é apto a cuidar de nenhum animal");
            }
        }
    }

    void alterarNomeAnimal(Animal animal, String novoNome){
        String nomeAtual = animal.getNome();
        animal.setNome(novoNome);
        System.out.println("Nome do animal alterado de "+nomeAtual+" para "+animal.getNome());
    }

    void printAnimais(){
        for(Animal animal:animais) {
            System.out.println("ID: " + animal.getId() + ", Nome: " + animal.getNome() + ", Especie: " + animal.getEspecie());
        }
    }
    void printFuncionarios(){
        for (Funcionario funcionario:funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", Especialidade: " + funcionario.getEspecialidade());
        }
    }


}
