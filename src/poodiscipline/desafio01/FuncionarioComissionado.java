package poodiscipline.desafio01;

public class FuncionarioComissionado extends Funcionario {
    private double salarioBase;
    private double comissao;

    public FuncionarioComissionado(String nome,String cpf,double salarioBase,double comissao){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.salario = calcularSalario();
    }

    double calcularSalario(){
        return this.salarioBase+this.comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
