package poodiscipline.listaoexercicios.questao06;

public class Gerente extends Funcionario{
    private Float bonus;
    private Float salarioGerente;
    public Gerente(String nome, Float salarioBase, Float bonus) {
        setNome(nome);
        setSalarioBase(salarioBase);
        setBonus(bonus);
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        setSalarioGerente(getSalarioBase()+getBonus());
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public Float getSalarioGerente() {
        return salarioGerente;
    }

    public void setSalarioGerente(Float salarioGerente) {
        this.salarioGerente = salarioGerente;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                ", salarioGerente=" + salarioGerente +
                '}';
    }
}
