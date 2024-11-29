package poodiscipline.desafio01;

public class FuncionarioHorista extends Funcionario{
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome,String cpf,int horasTrabalhadas,double valorHora){
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.salario = calcularSalario();
    }

    double calcularSalario(){
        return this.horasTrabalhadas*this.valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
