package dataStructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        LinkedList otherLinkedList = new LinkedList(5);

        otherLinkedList.append(6);
        otherLinkedList.append(9);
        otherLinkedList.append(12);
        myLinkedList.append(2);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(50);
        myLinkedList.merge(otherLinkedList);

        myLinkedList.printList();
    }
}