package LINKEDLIST;

public class DeleteNode {
    public static void deleteNode(Node node) {
        node.data=node.next.data;
        node.next=node.next.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        n1.next=n2;
        n2.next=n3;
        deleteNode(n2);
        while(n1!=null){
            System.out.println(n1.data+" ");
            n1=n1.next;
        }
    }
}
