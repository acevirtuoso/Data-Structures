//DLL FILE

package datastructures.linear;

import datastructures.nodes.DNode;

public class DLL<x extends Comparable<x>> extends SLL<x> {
    protected DNode<x> tail;
    protected DNode<x> head;
    protected int size;
    protected DNode<x> sorted;
    protected DNode<x> tailPointer;

    public DLL() {
        setHead(null);
        setTail(null);
    }

    public DLL(DNode<x> node, DNode<x> tail) {
        setHead(node);
        setTail(tail);
    }

    public DNode<x> getNode(int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return null;
        }
        DNode<x> current = this.head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void insertHead(DNode<x> node) {
        // super.insertHead(node);
        if (head == null) {
            setTail(node);
            setHead(node);
        } else {
            node.setNext(head);
            head.setPrevious(node);
            setHead(node);
        }
        size++;    
    }

    @Override
    public void insertTail(DNode<x> node) {
        if (head == null) {
            setHead(node);
            setTail(node);
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
            setTail(node);
        }
        size++;

    }

    @Override
    public void insert(DNode<x> node, int position) {
        if(head == null){
            head = node;
            tail = node;
        }
        else if(getNode(position) == null) {
            insertTail(node);
            size--;
        }
        else if(position == 0) {
            insertHead(node);
            size--;
        }
        else {
            DNode<x> current = getNode(position);
            DNode<x> previous = current.getPrevious();
            previous.setNext(node);
            node.setPrevious(previous);
            node.setNext(current);
            current.setPrevious(node);

        }
        size++;

    }

    @Override
    public DNode<x> deleteHead() {
        if (head== null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            setHead(head.getNext());
            head.setPrevious(null);
        }

        size--;
        return getHead();
    }

    @Override
    public DNode<x> deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else if (head == tail) {
            DNode<x> temp = head;
            head = null;
            tail = null;
            size--;
            return temp;
        } else {
            DNode<x> temp = tail;
            setTail(tail.getPrevious());
            tail.setNext(null);
            size--;
            return temp;
        }

    }

    @Override
    public DNode<x> Delete(DNode<x> node) {
        // if (getHead() == null) {
        //     System.out.println("List is empty");
        //     return null;
        // } else if (getHead() == getTail()) {
        //     DNode<x> temp = getHead();
        //     setHead(null);
        //     setTail(null);
        //     setSize(getSize()-1);
        //     return temp;
        // } else if (node == getHead()) {
        //     deleteHead();
        //     setSize(getSize()-1);
        //     return node;
        // } else if (node == getTail()) {
        //     deleteTail();
        //     setSize(getSize()-1);
        //     setTail(node.getPrevious());
        //     return node;
        // } else {
        //     DNode<x> nodeBefore = node.getPrevious();
        //     DNode<x> nodeAfter = node.getNext();
        //     nodeBefore.setNext(nodeAfter);
        //     nodeAfter.setPrevious(nodeBefore);
        //     setSize(getSize()-1);
        //     return node;
        // }   
        // DNode<x> current = getHead();
        // DNode<x> x = null;
        // if (current.getData() == node.getData()) {
        //     // setSize(getSize()-1);
        //     return deleteHead();
        // }

        // else if(getTail().getData() == node.getData()) {
        //     // setSize(getSize()-1);
        //     return deleteTail();
        // }
        // while (current != null && current.getData() != node.getData()) {
        //     current = current.getNext();
        //     x = current;       
        // }

        // if (current == null) {
        //     System.out.println("Node not found");
        //     // setSize(getSize()+1);
        //     return null;
        // }
        // x.setNext(current.getNext());
        // current.getNext().setPrevious(x);
        // setSize(getSize()-1);
        // return current;
        if (node == head) {
            deleteHead();
            return null;
        }

        if (node == tail) {
            deleteTail();
            return null;
        }

        if (node == null || this.head == null) {
            return null;
        }

        DNode<x> current = head;
        while (current != null && current != node) {
            current = current.getNext();
        }
        if (current == null) {
            return null;
        }
        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        size--;
        return current;
    }

    @Override
    public void clear() {
        super.clear();
        this.tail = null;
        setSize(0);
        this.head = null;
    }

    @Override
    public void sortedInsert(DNode<x> node) {//doesnt work
        
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else if (node.getData().compareTo(head.getData()) <= 0) {
            insertHead(node);
        } else if (node.getData().compareTo(tail.getData()) >= 0) {
            insertTail(node);
        } 
        else {
            DNode<x> current = head.getNext();
            while (current != null) {
                if (node.getData().compareTo(current.getData()) < 0) {
                    node.setNext(current);
                    node.setPrevious(current.getPrevious());
                    current.getPrevious().setNext(node);
                    current.setPrevious(node);
                    break;
                }
                current = current.getNext();
                size++;
            }
        }
        sort();
    }

    @Override
    public void print() {
        System.out.println("Doubly Linked List");
        System.out.println("Size: " + this.size);
        System.out.println("Sorted: " + this.isSorted());
        System.out.print("Content: ");
        DNode<x> current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    @Override
    public void sort(){
        // super.sort();
        // // setTail(getLastNode());
        if (size <= 1) {
            return;
        }
        DNode<x> newHead = null;
        while (head != null) {
            DNode<x> nodex = head;
            head = nodex.getNext();
            if (newHead == null || nodex.getData().compareTo(newHead.getData()) < 0) {
                nodex.setNext(newHead);
                newHead = nodex;
            } else {
                DNode<x> current = newHead;
                while (current.getNext() != null && nodex.getData().compareTo(current.getNext().getData()) > 0) {
                    current = current.getNext();
                }
                nodex.setNext(current.getNext());
                current.setNext(nodex);
            }
        }
        head = newHead;
        DNode<x> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        tail = current;
    }
    
    public DNode<x> getHead() {
        return head;
    }

    public void setHead(DNode<x> head) {
        this.head = head;
    }

    public DNode<x> getTail() {
        return tail;
    }

    public void setTail(DNode<x> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
