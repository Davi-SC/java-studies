public class ContaCorrente {

    float saldo;
    String nome;

    public ContaCorrente(String nome, Float saldo) {
        this.nome=nome;
        this.saldo = saldo;
    }

    float verificaSaldo(){
        return saldo;
    }
    void depositaValor(float valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }
    void sacarValor(float valor) {
        if(valor <= saldo){
            saldo -= valor;
        }
    }


}