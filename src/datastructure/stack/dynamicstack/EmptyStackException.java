package datastructure.stack.dynamicstack;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super("Pilha Vazia");
    }
}
