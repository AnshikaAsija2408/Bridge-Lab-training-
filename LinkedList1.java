public class LinkedList1 {
    class Node {
        int data;
        Node next;
    }

public static void main(String[] args){
    Node n1=new Node();
    Node n2=new Node();
    Node n3=new Node();

    n1.data=10;
    n2.data=20;
    n3.data=30;

    n1.next=n2;
    n2.next=n3;
    Node head = n1;
}
}