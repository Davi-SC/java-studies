package poodiscipline.desafio01;

abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    abstract double calcularSalario();

    public String toString() {
        return "" + nome +
                ", " + cpf +
                ", " + salario ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
