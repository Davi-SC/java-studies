package poodiscipline.listaoexercicios.questao04;

public abstract class Conta {
    private Float saldo;
    private String titular;

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(Float valor){};
    public void sacar(Float valor){};

}
