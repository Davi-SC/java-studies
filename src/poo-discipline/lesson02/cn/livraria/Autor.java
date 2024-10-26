package lesson02.cn.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public Autor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
        void mostrarDetalhes(){
            System.out.println("Autor:  "+nome);
            System.out.println("Email do Autor:  "+email);
            System.out.println("CPF do Autor:  "+cpf);

    }


}
