package poodiscipline.listaoexercicios.questao04;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular) {
        setTitular(titular);
        setSaldo(0.0F);
    }

    @Override
    public void depositar(Float valor){
        setSaldo((getSaldo()+valor));
        System.out.println("Valor depositado: "+valor);
        System.out.println("Saldo atual: "+getSaldo());
    };
    @Override
    public void sacar(Float valor){
        setSaldo((getSaldo()-valor));
        System.out.println("Valor sacado: "+valor);
        System.out.println("Saldo atual: "+getSaldo());
    };
    public void renderJuros(Float juros){
        Float novosaldo = getSaldo()+((juros/100)*getSaldo());
        setSaldo(novosaldo);
    };

    @Override
    public String toString() {
        return "ContaPoupanca[TITULAR: "+getTitular()+", SALDO: "+getSaldo()+"]" ;
    }
}
