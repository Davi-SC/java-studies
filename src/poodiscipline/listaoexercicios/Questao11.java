package poodiscipline.listaoexercicios;

import java.util.ArrayList;
import java.util.List;

abstract class Funcionario{
    private String nome;
    private double salarioBase;
    public abstract double calcularSalario(Funcionario funcionario);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
class Gerente extends Funcionario{
    @Override
    public double calcularSalario(Funcionario funcionario) {
        return funcionario.getSalarioBase()+1000;
    }
    public Gerente(String nome, double salarioBase){
        setNome(nome);
        setSalarioBase(salarioBase);
    }
    public Gerente(String nome){
        setNome(nome);
        setSalarioBase(2860);
    }
}
class Desenvolvedor extends Funcionario{
    @Override
    public double calcularSalario(Funcionario funcionario) {
        return funcionario.getSalarioBase()+500;
    }

    public Desenvolvedor(String nome, double salarioBase){
        setNome(nome);
        setSalarioBase(salarioBase);
    }
    public Desenvolvedor(String nome){
        setNome(nome);
        setSalarioBase(1430);
    }
}

class Empresa {

    public static void calcularFolha(List<Funcionario> funcs){
        for (Funcionario funcionario : funcs) {
            System.out.println("---------------------------------");
            System.out.println("Funcionario: "+funcionario.getNome());
            System.out.println("Salario: "+funcionario.calcularSalario(funcionario));
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Gerente gerente1 = new Gerente("John", 5000);
        Gerente gerente2 = new Gerente("Carl");

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Pierre", 3000);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Davi");

        funcionarios.add(gerente1);
        funcionarios.add(gerente2);
        funcionarios.add(desenvolvedor1);
        funcionarios.add(desenvolvedor2);

        calcularFolha(funcionarios);
    }


}
