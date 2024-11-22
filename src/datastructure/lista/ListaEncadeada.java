package datastructure.lista;

public class ListaEncadeada {

    private No head ;
    private No tail ;
    private int size ;


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

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "head=" + head +
                '}';
    }
}
