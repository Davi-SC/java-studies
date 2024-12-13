package poodiscipline.lesson04.exemploContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente[] accounts = new ContaCorrente[3];

        accounts[0] = new ContaCorrente("Davi",100);
        accounts[1] = new ContaCorrente("Silva",800);
        accounts[2] = new ContaCorrente("Cruz",1000);

        for (ContaCorrente account : accounts){
            System.out.println(account);
            ContaCorrente.printStatus(account);
        }


    }
}
