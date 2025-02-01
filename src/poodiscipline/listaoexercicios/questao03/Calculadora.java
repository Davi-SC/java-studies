package poodiscipline.listaoexercicios.questao03;

import java.util.Scanner;

public class Calculadora {
    public Integer somar(Integer x,Integer y){
        return x+y;
    }
    public Double somar(Double x,Double y){
        return x+y;
    }

    public Integer subtrair(Integer x,Integer y){
        return x-y;
    }
    public Double subtrair(Double x,Double y){
        return x-y;
    }

    public Integer multiplicar(Integer x,Integer y){
        return x*y;
    }
    public Double multiplicar(Double x,Double y){
        return x*y;
    }

    public Integer dividir(Integer x,Integer y){
        return x/y;
    }
    public Double dividir(Double x,Double y){
        return x/y;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(1,3));
        System.out.println(calculadora.somar(1.5,3.9));
        System.out.println(calculadora.subtrair(10,3));
        System.out.println(calculadora.subtrair(13.5,3.9));
        System.out.println(calculadora.multiplicar(1,3));
        System.out.println(calculadora.multiplicar(1.5,3.0));
        System.out.println(calculadora.dividir(15,3));
        System.out.println(calculadora.dividir(100.5,3.9));
    }
}
