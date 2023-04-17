package datastructures.linear;

import datastructures.nodes.DNode;

public class CDLL<x extends Comparable<x>> extends DLL<x> {    
    public CDLL() {
        super();
        tail = null;
    }

    public CDLL(DNode<x> node, DNode<x> tail) {
        super(node, tail);
        if (node != null) {
            tail = node;
        }
        if (head != null) {
            head.setPrevious(tail);
            tail.setNext(head);
        }
        size++;
    }

    public void insert(DNode <x> node, int position){
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            insertHead(node);
        } else if (position == size) {
            insertTail(node);
        } else {
            DNode<x> current = getNode(position);
            node.setNext(current);
            node.setPrevious(current.getPrevious());
            current.getPrevious().setNext(node);
            current.setPrevious(node);
            size++;
        }
    }

    public DNode<x> Delete(DNode<x> node) {
        return super.Delete(node);
    }
}
