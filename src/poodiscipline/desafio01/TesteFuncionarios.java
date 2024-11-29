package poodiscipline.desafio01;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionarios {

    public static void main(String[] args) {
        List<Funcionario> funcionarios  = new ArrayList<>();

        funcionarios.add(new FuncionarioComum("Davi","123.456.789.01",1500)) ;
        funcionarios.add(new FuncionarioComissionado("Silva","123.456.789.02",1000,500));
        funcionarios.add(new FuncionarioHorista("Cruz","123.456.789.01",8,187.5));

        int i = 0 ;
        while(i < funcionarios.size()){
            System.out.println(funcionarios.get(i).toString()) ;
            i++ ;
        }

    }
}
