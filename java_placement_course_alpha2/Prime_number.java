package java_placement_course_alpha2;

public class Prime_number {
    public static boolean prime(int n){
        if (n==2){
            return true;
        }
        for (int i = 2; i <= n-1; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=11;
        System.out.println(prime(n));
    }
}
