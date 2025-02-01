package poodiscipline.listaoexercicios.questao01;

import java.util.ArrayList;
import java.util.List;

public class TesteQ01 {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Gato gato1 = new Gato("finn");
        Gato gato2 = new Gato("beth");
        Cachorro cao1 = new Cachorro("scooby");
        Cachorro cao2 = new Cachorro("chorume");

        animais.add(gato1);
        animais.add(cao1);
        animais.add(gato2);
        animais.add(cao2);

        for(Animal animal:animais){
            System.out.println("Animal 1: ");
            animal.fazerSom();
        }
    }
}
