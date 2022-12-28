package java_placement_course_alpha2;

public class Tree_DiameterOfTree {
    public static class Node{
        int data;
        Node left;
        Tree_heightOfTree.Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Tree_heightOfTree.Node root){
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Tree_heightOfTree.Node root){
        if (root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }
    public static int sum(Tree_heightOfTree.Node root){
        if (root==null){
            return 0;
        }
        int lh=sum(root.left);
        int rh=sum(root.right);
        return lh+rh+ root.data;
    }
    public static int diameter(Node root){
        if (root==null){
            return 0;
        }
        int ld=diameter(root.left);
//        int lht=height(root.left)
//        int rd=diameter(root.right);
        int rht=height(root.right);

//        int selfDiam=lht+rht+1;
//
//        return Math.max(selfDiam,Math.max(ld,rd));
        return 0;

    }
    public static void main(String[] args) {
        /*
                    1
                   /  \
                  2    3
                 / \  / \
                4   5 6  7
         */
        Node root=new Node(1);
        root.left=new Node(2);

        System.out.println(diameter(root));
    }
}
