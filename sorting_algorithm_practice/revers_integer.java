package sorting_algorithm_practice;

public class revers_integer {
    public static int revers(int x) {
        int ans=0;
        while (x>0) {
            int rem = x % 10;
            ans +=10*rem;
            x = x / 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=123;
        System.out.println(revers(x));
//        revers(x);
    }
}
