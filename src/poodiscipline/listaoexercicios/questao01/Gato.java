package poodiscipline.listaoexercicios.questao01;

public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    public Gato(String nome){
        this.nome = nome;
    }
}
