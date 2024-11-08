package cn.livraria;

public class Livraria {

    int capacidade = 100;
    int size = 0;

    Livro livros[];

    Livraria(int tam){
        livros = new Livro[tam];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void adicionarLivro(Livro livro) throws RuntimeException {
        if(size ==  livros.length) {
            throw new RuntimeException("Não cabe mais, TIRAAAAA");
        }
        livros[size] = livro;
        size++;

    }

    public Livro buscarLivro(String titulo) throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("Esta vazio");
        }
        for (int i = 0; i < size; i++) {
            if(livros[i].getTitulo().equals(titulo)){
                return livros[i];
            }
        }
        throw new RuntimeException("Livro nao encontrado");
    }

}
