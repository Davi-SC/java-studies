package datastructure.deque;

public class Node {
    private String element;
    private Node next ;
    private Node previous ;


    public Node() {
        this.element = null;
        this.next = null;
        this.previous = null ;
    }
    public Node(String element, Node next) {
        this.element = element;
        this.next = null;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "No{" +
                "element='" + element + '\'' +
                ", next=" + next +
                '}';
    }
}
