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
            this.tail.setNext(celula);
        }
        this.tail = celula ;
        this.size++ ;
    }

    public int getSize(){
        return this.size ;
    }

    public boolean isEmpty(){
        return size ==0 ;
    }

    public void removeLast(){

        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }

        Node current = head.getNext();
        Node previous = head;

        while(current.getNext() != null){
            previous = current ;
            current = current.getNext() ;
        }

        previous.setNext(null);
        tail = previous ;
        size --;
    }

    public void removeFirst(){

        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }
        Node primeiro = head.getNext() ;
        Node segundo = primeiro.getNext() ;

        head.setNext(segundo);
        segundo.setPrevious(head);

        size --;
    }

    


    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "head= " + head +
                '}';
    }
}
