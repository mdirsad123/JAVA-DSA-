package java_placement_course_alpha2;

public class recursion_xpowerOptimized {
    public static int powerOptimized(int x, int n){
        if (n==0){
            return 1;
        }
//        int halfPower=powerOptimized(x,n/2)*powerOptimized(x,n/2);
        int halfPowersq=powerOptimized(x,n/2);
        int halfPower=halfPowersq*halfPowersq;
        if (n%2 !=0){
            halfPower *=x;
        }
        return halfPower;
    }
    public static void main(String[] args) {
        int x=2;
        int n=4;
        System.out.println(powerOptimized(x,n));
    }
}
