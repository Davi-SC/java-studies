package lesson02.cn.livraria;

import java.util.Scanner;

public class CadastroDeLivros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Autor autor = new Autor("Davi", "davi@gmail.com", "123.456.789-00");
        Livro livroJava = new Livro("Java","Aprenda java", "103-121-3-12", 75.99 ,autor);
        Livro livroPython = new Livro("Python","Aprenda Python", "102-121-2-45", 99.99 , autor);

        livroJava.mostrarDetalhes();
        livroPython.mostrarDetalhes();

    }

}
