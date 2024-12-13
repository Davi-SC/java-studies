package poodiscipline.lesson04.exemploContaCorrente;

public class ContaCorrente {
    static int numAccounts = 0;
    static double moneyTotal = 0;
    private String name;
    private double balance;

    ContaCorrente(String name,double balance){
            this.name = name;
            this.balance = balance;
            numAccounts++;
            moneyTotal += balance;
    }

    public static void printStatus(ContaCorrente account){
        if (account.balance<200){
            System.out.println("Liso");
        }else if(account.balance<1000){
            System.out.println("Ta melhor");
        }else {
            System.out.println("Ta forrando paizao");
        }
    }

    @Override
    public String toString() {
        return "[Name: " + name +
                ", Balance: " + balance +
                "]";
    }
}
