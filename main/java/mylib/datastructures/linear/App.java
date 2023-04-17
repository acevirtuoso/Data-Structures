package datastructures.linear;
import datastructures.nodes.*;

public class App {
    public static void main(String[] args) {
        DNode<Integer> node1 = new DNode<Integer>(10);
        DNode<Integer> node2 = new DNode<Integer>(9);
        DNode<Integer> node3 = new DNode<Integer>(8);
        DNode<Integer> node4 = new DNode<Integer>(7);
        DNode<Integer> node5 = new DNode<Integer>(6);
        DNode<Integer> node6 = new DNode<Integer>(5);
        DNode<Integer> node7 = new DNode<Integer>(4);
        DNode<Integer> node8 = new DNode<Integer>(3);

        System.out.println("printing list1");
        SLL<Integer> list1 = new SLL<Integer>();
        list1.print();
        System.out.println('\n');


        System.out.println("printing list2");
        SLL<Integer> list2 = new SLL<Integer>(node1);
        list2.print();
        System.out.println('\n');

        System.out.println("this is insertHead:");
        list2.insertHead(node2);
        list2.print();
        System.out.println('\n');
        
        System.out.println("this is insertTail:");
        list2.insertTail(node4);
        list2.print();
        System.out.println('\n');

        
        System.out.println("this is sortedInsert:");
        list2.sortedInsert(node3);
        list2.print();
        System.out.println('\n');

        
        
        System.out.println("Testing insert with node5, position 3:");
        list2.insert(node5,3);
        list2.print();
        System.out.println('\n');

        System.out.println("Testing insert with node6, position 1:");
        list2.insert(node6,1);
        list2.print();
        System.out.println('\n');

        System.out.println("Testing insert with node7, position list2 size:");
        list2.insert(node7,list2.getSize());
        list2.print();
        
        
        System.out.println("Testing search with node4:");
        DNode<Integer> node9 = list2.search(node4);
        if(node9 != null) {
            System.out.println("Found");
        }else {
            System.out.println("NotFound");
        }
        System.out.println('\n');


        System.out.println("Testing search with node8:");
        DNode<Integer> node10 = list2.search(node8);
        if(node10 != null) {
            System.out.println("Found");
        }else {
            System.out.println("NotFound");
        }
        System.out.println('\n');
        

        System.out.println("Testing sort:");
        list2.sort();
        list2.print();
        System.out.println('\n');
        
        System.out.println("Testing DeleteHead:");
        list2.deleteHead();
        list2.print();
        System.out.println('\n');

        System.out.println("Testing DeleteTail:");
        list2.deleteTail();
        list2.print();
        System.out.println('\n');
        
        System.out.println("Testing Delete with node4:");
        list2.Delete(node4);
        list2.print();
        System.out.println('\n');

        System.out.println("Testing Delete with node8:");
        list2.Delete(node8);
        list2.print();
        System.out.println('\n');
        
        System.out.println("Testing Clear:");
        list2.clear();
        list2.print();
    }
}
