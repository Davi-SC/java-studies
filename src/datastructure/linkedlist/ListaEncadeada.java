package datastructure.linkedlist;

public class ListaEncadeada {

    private No head ;
    private No tail ;
    private int size ;

    ListaEncadeada(){
        this.head = null ;
        this.tail = null;
        this.size = 0;
    }

    public void adiciona(String elemento){
        No celula = new No(elemento);
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
        return size == 0;
    }

    public void removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }
        head = head.getProximo();

    }
    public void removeLast(){

        if(isEmpty()){
            throw new RuntimeException("vetor vazio") ;
        }

        No current = head.getProximo();
        No previous = head;

        while(current.getProximo() != null){
            previous = current ;
            current = current.getProximo() ;
        }

        previous.setProximo(null) ;
        tail = previous ;
        size --;
    }


    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "head= " + head +
                '}';
    }
}
