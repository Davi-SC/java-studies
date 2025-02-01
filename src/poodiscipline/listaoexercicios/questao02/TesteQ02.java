package poodiscipline.listaoexercicios.questao02;

import java.util.ArrayList;
import java.util.List;

public class TesteQ02 {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        Estudante e1 = new Estudante("FP001","Kendrick","111.222.333-44",28);
        Estudante e2 = new Estudante("FP002","Lamar","111.222.666-77",82);
        Estudante e3 = new Estudante("FP003","Kayne","333.777.666-69",777);


        estudantes.add(e1);
        estudantes.add(e2);
        estudantes.add(e3);

        for(Estudante estudante : estudantes){
            System.out.println(estudante.toString());
        }
    }
}
