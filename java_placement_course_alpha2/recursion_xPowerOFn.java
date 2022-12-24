package java_placement_course_alpha2;

public class recursion_xPowerOFn {
    public static int xpower(int x, int n){
        if (n==0){
            return 1;
        }
        int xpn=xpower(x,n-1);
        return x*xpn;
    }
    public static void main(String[] args) {
        int x=4;
        int n=3;
        System.out.println(xpower(x,n));
    }
}
