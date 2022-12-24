package java_DSA_practice;

public class recursive_fc {
    public static int printcheck(int n){
        if (n==0)
            return 0;
        System.out.print(n);
        printcheck(n-1);
        return 0;
    }


    public static void main(String[] args) {
        int n=4;
        System.out.print(printcheck(n));
    }
}
