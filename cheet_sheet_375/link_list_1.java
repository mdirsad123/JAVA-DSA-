package cheet_sheet_375;

public class link_list_1 {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("Null");
    }

    // Driver Code
    public static void main(String[] args) {
        link_list_1 list = new link_list_1();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(34);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
//    static Node head; // head of list
//
//    static class Node {
//        int data;
//        Node next;
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }
//
//    static Node reverse(Node head)
//    {
//        if (head == null || head.next == null)
//            return head;
//
//        /* reverse the rest list and put
//        the first element at the end */
//        Node rest = reverse(head.next);
//        head.next.next = head;
//
//        /* tricky step -- see the diagram */
//        head.next = null;
//
//        /* fix the head pointer */
//        return rest;
//    }
//
//    /* Function to print linked list */
//    static void print()
//    {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    static void push(int data)
//    {
//        Node temp = new Node(data);
//        temp.next = head;
//        head = temp;
//    }
//
//
//    /* Driver program to test above function*/
//    public static void main(String args[])
//    {
//        /* Start with the empty list */
//
//        push(20);
//        push(4);
//        push(15);
//        push(85);
//
//        System.out.println("Given linked list");
//        print();
//
//        head = reverse(head);
//
//        System.out.println("Reversed Linked list");
//        print();
//    }
}
