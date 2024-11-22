package desafio01;

public class FuncionarioComum extends Funcionario{

    private double salarioMensal;

    public FuncionarioComum(String nome,String cpf,double salarioMensal){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
        this.salario = calcularSalario();
    }

    double calcularSalario(){
        return this.salarioMensal;
    }


    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }


}
