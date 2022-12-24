package java_DSA_practice;

import java.util.Scanner;

public class number_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no,");
        int a= sc.nextInt();
        if (a%2==0)
            System.out.println(a+" the no. is even");
        else
            System.out.println(a+" the no. is odd");

    }
}
