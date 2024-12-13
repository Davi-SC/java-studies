package datastructure.stack.dynamicstack;

public class VectorStack implements IStack{
    int capacidade;
    String S[];

    int size = 0;

    public VectorStack(int capacidade){
        this.capacidade = capacidade;
        S = new String[capacidade];
    }

    @Override
    public String toString() {
        String s = "[";
        if(size > 0){
            for(int i = 0; i<size();i++){
                if (S[i] != top()){
                    s += S[i]+",";
                }
                else {
                    s += S[i];
                }
            }
        }
        return s+"]";
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String top() {
        return "";
    }

    @Override
    public void push(String element) {

    }

    @Override
    public String pop() {
        return "";
    }
}
