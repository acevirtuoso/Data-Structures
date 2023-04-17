package datastructures.linear;

import datastructures.nodes.*;

public class QueueLL<x extends Comparable<x>> extends SLL<x> {
    public QueueLL() {
        super();
    }

    public QueueLL(DNode<x> node) {
        super(node);
    }

    public void enqueue(DNode<x> node) {
        super.insertTail(node);
    }

    public DNode<x> dequeue() {
        return super.deleteHead();
        
    }

    @Override
    public void insertHead(DNode<x> node) {
        // Do nothing
    }

    @Override
    public void insert(DNode<x> node, int position) {
        // Do nothing
    }

    @Override
    public DNode<x> deleteHead(){
        super.deleteHead();
        setTail(null);
        return getHead();
    }

    @Override
    public void insertTail(DNode<x> node) {
        return;

    }

    @Override
    public DNode<x> deleteTail() {
        return null;
    }

}
