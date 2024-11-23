package datastructure.deque;

import datastructure.deque.Node;

public class Deque {

    private Node head  = new Node();
    private Node tail ;
    private int size ;

    Deque(){
        this.head = null ;
        this.tail = null;
        this.size = 0;
    }

    public void adiciona(String elemento){
        Node celula = new Node();
        celula.setElement(elemento);
        if(this.size == 0){
            this.head = celula ;
        }
        else{
            this.tail.setProximo(celula);
        }
        this.tail = celula ;
        this.size++ ;
    }

    public int getSize(){
        return this.size ;
    }

    public boolean isEmpty(){

    }

    public void removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }
        head = head.next;

    }
    public void removeLast(){

        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }

        Node current = head.next;
        Node previous = head;

        while(current.next != null){
            previous = current ;
            current = current.next ;
        }

        previous.next = null ;
        tail = previous ;
        size --;
    }

    public void removeFirst(){

        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }
        Node primeiro = head.next ;
        Node segundo = primeiro.next ;

        head.next = segundo ;
        segundo.previous = head ;

        size --;
    }

    


    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "head= " + head +
                '}';
    }
}
