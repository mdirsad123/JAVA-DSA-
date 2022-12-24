package java_DSA_practice;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a table number");
        int n=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"*"+i+"="+(i*n));
        }
    }
}
