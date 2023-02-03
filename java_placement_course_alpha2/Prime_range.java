package java_placement_course_alpha2;

public class Prime_range {
    public static void prime(int n){
        while (n>1){
            if (isPrime(n)){
                System.out.print(n+" ");
            }
            n--;
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= n-1; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=20;
        prime(n);
    }
}
