package practice_practice_practice;

import java.util.Scanner;

public class patt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
    }
}
