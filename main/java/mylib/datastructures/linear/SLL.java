package datastructures.linear;

import datastructures.nodes.*;

public class SLL<x extends Comparable<x>> {
    private DNode<x> head;
    private DNode<x> tail;
    private int size;
    private DNode<x> sorted;

    public SLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public SLL(DNode<x> head) {
        this.head = head;
        tail = head;
        size = 1;
    }

    public DNode<x> getNode(int position){
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return null;
        }
        DNode<x> current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }
    public void insertHead(DNode<x> DNode) {
        if (head == null) {
            head = DNode;
            tail = DNode;
        } else {
            DNode.setNext(head);
            head = DNode;
        }
        size++;
    }

    public void insertTail(DNode<x> DNode) {
        if (head == null) {
            head = DNode;
            tail = DNode;
        } else {
            tail.setNext(DNode);
            tail = DNode;
        }
        setSize(getSize()+1);
    }

    public void insert(DNode<x> DNode, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
        }
        if (position == 0) {
            insertHead(DNode);
        }
        if (position == size) {
            insertTail(DNode);
        }
        DNode<x> current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.getNext();
        }
        DNode.setNext(current.getNext());
        current.setNext(DNode);
        // size++;
    }

    public void sortedInsert(DNode<x> node) { // this does not work for some reason
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        if (!isSorted()) {
            sort();
        }

        if (node.getData().compareTo(head.getData()) <= 0) {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        } else if (node.getData().compareTo(tail.getData()) >= 0) {
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        } else {
            DNode<x> current = head.getNext();
            while (node.getData().compareTo(current.getData()) > 0) {
                current = current.getNext();
            }
            node.setPrevious(current.getPrevious());
            node.setNext(current);
            current.getPrevious().setNext(node);
            current.setPrevious(node);
        }

        size++;
    }

    public DNode<x> search(DNode<x> DNode) {
        DNode<x> current = head;
        while (current != null) {
            if (current.getData() == DNode.getData()) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public DNode<x> deleteHead() {
        if (head != null && size > 1) {
            DNode<x> temp = getHead();
            setHead(getHead().getNext());
            setSize(getSize() - 1);
            return temp;
        }

        if (size == 1){
            head = null;
            tail = null;
            size--;
        }

        if (size == 0){
            System.out.println("List is empty");
        }
        return null;

    }

    public DNode<x> deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        DNode<x> current = head;
        DNode<x> x = null;
        while (current.getNext() != null) {
            if (current.getNext() == tail) {
                x = tail;
                tail = current;
                tail.setNext(null);
                setSize(getSize() - 1);
                return x;
            }
            current = current.getNext();
        }
        return x;

    }

    public DNode<x> Delete(DNode<x> DNode) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        DNode<x> current = head;
        DNode<x> x = null;
        while (current.getNext() != null) {
            if (current.getNext().getData() == DNode.getData()) {
                x = current.getNext();
                current.setNext(current.getNext().getNext());
                size--;
                return x;
            }
            current = current.getNext();
        }
        return x;
    }

    public void sort() {
        if (size <= 1) {
            return;
        }
        DNode<x> newHead = null;
        while (head != null) {
            DNode<x> node = this.head;
            head = node.getNext();
            if (newHead == null || Integer.parseInt(String.valueOf(node.getData())) < Integer
                    .parseInt(String.valueOf(newHead.getData()))) {
                node.setNext(newHead);
                newHead = node;
            } else {
                DNode<x> current = newHead;
                while (current.getNext() != null && Integer.parseInt(String.valueOf(node.getData())) > Integer
                        .parseInt(String.valueOf(current.getNext().getData()))) {
                    current = current.getNext();
                }
                node.setNext(current.getNext());
                current.setNext(node);
            }
        }
        head = newHead;
        DNode<x> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        tail = current;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }


    public void print() {
        System.out.println("List length: " + size);
        System.out.println("Sorted status: " + isSorted());
        System.out.print("List content: ");
        DNode<x> current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    protected boolean isSorted() {
        if (head == null) {
            return true; // an empty list is considered sorted
        }

        DNode<x> current = head;
        while (current.next != null) {
            if (current.data.compareTo(current.next.data) > 0) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public DNode<x> getHead() {
        return head;
    }

    public DNode<x> getTail() {
        return tail;
    }

    public void setHead(DNode<x> head) {
        this.head = head;
    }

    public void setTail(DNode<x> tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DNode<x> getLastNode() {
        DNode<x> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

}
