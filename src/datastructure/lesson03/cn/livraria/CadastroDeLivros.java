package cn.livraria;

public class CadastroDeLivros {

    Livro[] livros = new Livro[]{new Livro()};

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
