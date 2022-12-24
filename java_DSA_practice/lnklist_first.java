package java_DSA_practice;

public class lnklist_first {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    // add first
    public void addfirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add last
    public void addlast(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        Node currNode=head;
        while (currNode != null){
            System.out.print(currNode.next+" --> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        lnklist_first list=new lnklist_first();
        list.addfirst("hello");
        list.addlast("bhai");
        list.addfirst("sahil");
        list.printlist();
    }
}
