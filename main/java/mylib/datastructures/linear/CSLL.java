package datastructures.linear;
import datastructures.nodes.*;

public class CSLL<x extends Comparable<x>> extends SLL<x>{
    private DNode<x> head;
    private DNode<x> tail;
    private int size;
    
        public CSLL() {
            setHead(head);
            setTail(tail);
            setSize(size);
        }
    
        public CSLL(DNode<x> node) {
            super(node);
            // checking for null pointer exception
            if (node != null) {
                this.tail = node;
            }
            tail.setNext(head);
        }

        public void insertHead(DNode<x> node) {
            super.insertHead(node);
            if (tail == null) {
                tail = node;
            }
        }
        
        @Override
        public void insertTail(DNode<x> node) {
            super.insertTail(node);
            tail = node;
            node.setNext(getHead());


        }

        @Override
        public DNode<x> deleteHead() {
            super.deleteHead();
            tail = getLastNode();
            tail.setNext(head);
            return getHead();
        }
    }