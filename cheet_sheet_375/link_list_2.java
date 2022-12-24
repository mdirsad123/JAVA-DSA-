package cheet_sheet_375;

public class link_list_2 {
    static ListNode head;
    static class ListNode{
        public boolean val;
        int d;
        ListNode next;
        ListNode(int d){
            this.d=d;
            this.next=null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode show=head;
        while(fast.next !=null && fast.next.next !=null){
            fast=fast.next.next;
            show=show.next;
            if(fast==show)
                return true;
        }
        return false;
    }
    public boolean printList(ListNode head){
        while (head != null){
            head=head.next;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        link_list_2 list=new link_list_2();
        head=new ListNode(44);
        head.next=new ListNode(40);
        head.next.next=new ListNode(48);
        list.printList(head);
        list.hasCycle(head);
        list.printList(head);

    }
}
