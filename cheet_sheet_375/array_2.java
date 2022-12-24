package cheet_sheet_375;

import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numver ");
        int n= sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n%i==0){
                System.out.println("this is not a prime number");
                return;
            }
        }
        System.out.println("this is prime number");

    }
}