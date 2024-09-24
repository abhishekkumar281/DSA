package LINKEDLIST;

public class Reverse_Linked_List {
        public static Node reverseList(Node head) {
            Node prev = null;
            Node curr = head;
            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

    public static void main(String[] args) {
         Node n1 = new Node(1);
         Node n2 = new Node(2);
         Node n3 = new Node(3);
         Node n4 = new Node(4);
         Node n5 = new Node(5);
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=n5;
         Node ans = reverseList(n1);
         while(ans!=null){
             System.out.println(ans.data+" ");
             ans=ans.next;
        }
    }
}
