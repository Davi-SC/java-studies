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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
