package java_placement_course_alpha2;

import java.util.LinkedList;

public class linklist {
    public class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size=1;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size=0;
            return;
        }
        newNode.Next = head;
        head = newNode;
        size++;

    }

    public void last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size=0;
            return;
        }
        tail.Next = newNode;
        tail = newNode;
        size++;
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public void addMiddle(int indx, int data) {
        Node newNode = new Node(data);
        if (indx == 0) {
            addfirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < indx - 1) {
            temp = temp.Next;
            i++;
        }

        newNode.Next = temp.Next;
        temp.Next = newNode;
        size++;
    }

    public int removeFirst(){
        int val=head.data;
        if (head==null){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            head=tail=null;
            size--;
            return val;
        }
        head=head.Next;
        size--;
        return val;
    }
    public int removeLast(){
        if (head==null){
            System.out.println("linked list is empty");
            size=0;
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.Next;
        }
        int val=prev.Next.data;
        prev.Next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while (temp != null){
            if (temp.data==key){
                return i;
            }
            temp=temp.Next;
            i++;

        }
        //not found
        return -1;
    }
    public int helper(Node head, int key){
        if (head==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int idx=helper(head.Next,key);
        if (idx==-1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public Node getmid(Node head){
        Node fast=head.Next;
        Node slow=head;
        while (fast!=null && fast.Next!=null){
            slow=slow.Next;
            fast=fast.Next.Next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2){
        Node mergedLL =new Node(-1);
        Node temp=mergedLL;

        while (head1!=null && head2!=null){
            if (head1.data <= head2.data){
                temp.Next=head1;
                head1=head1.Next;
                temp=temp.Next;
            }
            else {
                temp.Next=head2;
                head2=head2.Next;
                temp=temp.Next;
            }

        }
        while (head1!=null){
            temp.Next=head1;
            head1=head1.Next;
            temp=temp.Next;
        }
        while (head2!=null){
            temp.Next=head2;
            head2=head2.Next;
            temp=temp.Next;
        }

        return mergedLL.Next;
    }
    public Node mergesort(Node head){
        //base case
        if (head==null || head.Next==null){
            return head;
        }
        //find mid
        Node mid=getmid(head);

        //left & right MS
        Node righthead=mid.Next;
        mid.Next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);

        //merge
        return merge(newleft, newright);
    }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);



    }
}
