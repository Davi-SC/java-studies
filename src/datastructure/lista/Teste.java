package datastructure.lista;

public class Teste {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada() ;

        lista.adiciona("Davi");
        System.out.println(lista);
        System.out.println(lista.getSize());

        lista.adiciona("Yure");
        System.out.println(lista);
        System.out.println(lista.getSize());

        lista.adiciona("Victor");
        System.out.println(lista);
        System.out.println(lista.getSize());
    }
}
