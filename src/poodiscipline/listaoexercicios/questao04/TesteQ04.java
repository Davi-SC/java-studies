package poodiscipline.listaoexercicios.questao04;

public class TesteQ04 {
    public static void main(String[] args) {
        ContaPoupanca contaP1 = new ContaPoupanca("Davi");
        System.out.println(contaP1.toString());
        contaP1.depositar(1000.00F);
        System.out.println(contaP1.toString());
        contaP1.sacar(900.00F);
        System.out.println(contaP1.toString());
        contaP1.renderJuros(2.0F);
        System.out.println(contaP1.toString());
    }
}
