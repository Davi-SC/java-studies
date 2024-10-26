package lesson02.cn.livraria;

import java.util.Scanner;

public class Livro {

    private String nome;
    private String descricao;
    private String isbn;
    private double valor;
    private Autor autor;

    Livro(String nome, String descricao, String isbn, double valor, Autor autor){
        this.nome = nome;
        this.descricao = descricao;
        this.isbn = isbn;
        this.valor = valor ;
        this.autor = autor;
    }

    Livro( ){}

    void mostrarDetalhes(Autor autor){

        System.out.println("Nome:  "+nome);
        System.out.println("Descricao:  "+descricao);
        System.out.println("Valor:  "+valor);
        System.out.println("ISBN:  "+isbn);
        autor.mostrarDetalhes();
        System.out.println("");

    }

    //SETS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    //GETS
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getIsbn() {
        return isbn;
    }
    public double getValor() {
        return valor;
    }
}
