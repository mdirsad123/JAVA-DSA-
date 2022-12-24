package java_placement_course_alpha2;

public class recursion_fibonacci {
    public static int fiboFn(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1=fiboFn(n-1);
        int fnm2=fiboFn(n-2);
        int fn=fnm1+fnm2;

        return fn;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(fiboFn(n));
    }
}
