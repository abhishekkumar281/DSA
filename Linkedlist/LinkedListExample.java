package LINKEDLIST;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next =null;
    }
}
public class LinkedListExample {

    public static int getCount(Node head) {
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        n1.next=n2;
        n2.next=n3;
        System.out.println(getCount(n1));
    }
}
