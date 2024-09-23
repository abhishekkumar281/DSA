package LINKEDLIST;

public class NodeDeletionLinked {
    public static Node deletelast(Node head){

        Node temp = head;
        if (head == null || head.next == null){
            return null;
        }
        while (temp.next.next != null){

            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        n1.next=n2;
        n2.next=n3;
        deletelast(n1);
        while(n1!=null){
            System.out.println(n1.data+" ");
            n1=n1.next;
        }
    }
}
