package poodiscipline.listaoexercicios.questao01;

public class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Au Au");
    }

    public Cachorro(String nome){
        this.nome = nome;
    }
}
