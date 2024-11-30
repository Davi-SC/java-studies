package datastructure.stack.dynamicstack;

public class FullStackException  extends RuntimeException{
    public FullStackException(){
        super("Pilha Cheia");
    }
}
