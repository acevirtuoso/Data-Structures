package datastructures.nodes;

public class DNode<x> {
    public x data;
    public DNode<x> next;
    public DNode<x> prev;

    public DNode(x data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void setNext(DNode<x> node) {
        this.next = node;
    }

    public DNode<x> getNext() {
        return next;
    }

    public void setPrevious(DNode<x> node) {
        this.prev = node;
    }

    public DNode<x> getPrevious() {
        return prev;
    }

    public x getData() {
        return this.data;
    }

}
