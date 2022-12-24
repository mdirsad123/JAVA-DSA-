package java_DSA_practice;

import java.util.Scanner;

public class funcation_add_sum {
    public static int addsum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sum=addsum(a,b);
        System.out.println(sum);
    }
}
