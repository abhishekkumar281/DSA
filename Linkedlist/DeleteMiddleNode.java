package LINKEDLIST;

public class DeleteMiddleNode {
    public static Node deleteMiddle(Node head) {
        if (head.next == null||head==null)
            return null;
        Node slow = head;
        Node fast = head.next.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        n1.next =n2;
        n2.next =n3;
        deleteMiddle(n1);
        while (n1!=null){
            System.out.println(n1.data);
            n1 = n1.next;
        }
    }
}
