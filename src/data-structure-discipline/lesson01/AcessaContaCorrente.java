
public class AcessaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente minhaconta = new ContaCorrente("João", 1000.0F);

        System.out.println(minhaconta.verificaSaldo());

        minhaconta.depositaValor(300);

        System.out.println(minhaconta.verificaSaldo());


    }
}