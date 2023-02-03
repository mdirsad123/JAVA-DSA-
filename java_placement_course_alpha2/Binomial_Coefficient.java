package java_placement_course_alpha2;

public class Binomial_Coefficient {
    public static void binomial(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nmr=factorial(n-r);

        int ans=nfact/(rfact*nmr);
        System.out.println(ans);
    }
    public static int factorial(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        binomial(n,r);
    }
}
