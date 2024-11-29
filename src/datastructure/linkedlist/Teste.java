package datastructure.linkedlist;

import datastructure.linkedlist.ListaEncadeada;

public class Teste {

    public static void main(String[] args) {
        datastructure.linkedlist.ListaEncadeada lista = new ListaEncadeada() ;

        lista.adiciona("Davi");
        System.out.println(lista);
        System.out.println(lista.getSize());

        lista.adiciona("Yure");
        System.out.println(lista);
        System.out.println(lista.getSize());

        lista.adiciona("Victor");
        System.out.println(lista);
        System.out.println(lista.getSize());

        lista.removeLast();
        System.out.println(lista);
        
    }
}
