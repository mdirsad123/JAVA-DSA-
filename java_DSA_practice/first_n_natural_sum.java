package java_DSA_practice;


import java.util.Scanner;

public class first_n_natural_sum {
    public static void main(String[] args) {

//        System.out.println("sahl kaose jp");
//        for (int i = 0; i < 100; i++) {
//            System.out.println("hello sahil"+i);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum is "+sum);
    }

}
