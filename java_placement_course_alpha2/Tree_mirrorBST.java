package java_placement_course_alpha2;

public class Tree_mirrorBST {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node mirrorInBST(Node root){
        if (root==null){
            return null;
        }
        Node leftBST=mirrorInBST(root.left);
        Node rightBST=mirrorInBST(root.right);

        root.left=rightBST;
        root.right=leftBST;
        return root;

    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {

        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);

        root=mirrorInBST(root);
        preOrder(root);

    }
}
