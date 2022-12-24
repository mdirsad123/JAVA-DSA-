package java_placement_course_alpha2;

public class recursion_fact {
    public static int fact(int n){
        if (n==0){
            return  1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(n));
    }
}
