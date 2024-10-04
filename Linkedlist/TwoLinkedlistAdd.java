package LINKEDLIST;

public class TwoLinkedlistAdd {

    public static Node addTwoNumbers(Node l1, Node l2) {

        Node result = new Node(0);
        Node ptr = result;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;  // Access l1.data, not l1.next.data
                l1 = l1.next;    // Move to the next node
            }
            if (l2 != null) {
                sum += l2.data;  // Access l2.data, not l2.next.data
                l2 = l2.next;    // Move to the next node
            }

            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new Node(sum);
            ptr = ptr.next;
        }

        // If carry remains after the loop, add a new node
        if (carry > 0) {
            ptr.next = new Node(carry);
        }

        return result.next;
    }

    // Helper method to print the linked list
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First linked list: 2 -> 3 -> 4
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        n1.next = n2;
        n2.next = n3;

        // Second linked list: 2 -> 3 -> 4
        Node l1 = new Node(2);
        Node l2 = new Node(3);
        Node l3 = new Node(4);
        l1.next = l2;
        l2.next = l3;

        Node result = addTwoNumbers(n1, l1);

        // Print the result linked list
        printList(result);
    }


}

