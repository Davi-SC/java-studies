

public class Day1810 {

    void example02(int x, int y){
        int resultado = x + y;
        System.out.println(x+"+"+y+"="+resultado);
    }
    float example03(float x){
        float resultado = (3*x*x)+(2*x)+7;
        return resultado;
    }

    public static void main(String[] args) {
        Day1810 aula = new Day1810();
        System.out.println("f(2) = " +aula.example03(2));

    }
}