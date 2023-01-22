package practice_practice_practice;

import java_placement_course_alpha2.Tree_heightOfTree;
import java_placement_course_alpha2.linklist;

import java.util.LinkedList;

public class FindMiddle_linkedlist {
    public class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node middleFind(Node head){
        if (head==null){
            return null;
        }
        Node slow= head.next;
        Node fast= head.next.next;
        while (fast!=null && fast.next!=null){
            slow= head.next;
            fast= head.next.next;

        }
        return slow;
    }
    public static void main(String[] args) {
        LinkedList<Integer> s=new LinkedList<>();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        s.remove(head.next);
        System.out.println(s);
//        System.out.println(head);

        System.out.println(middleFind(head));
//        middleFind(s);
    }
}
