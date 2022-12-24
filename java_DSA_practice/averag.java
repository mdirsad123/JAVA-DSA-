package java_DSA_practice;

import java.util.Scanner;

public class averag {
//    public static void findavarage(int a, int b, int c){
//        int av=(a+b+c)/3;
//        System.out.println(av);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        findavarage(a,b,c);
//
//    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size= ");
    int size= sc.nextInt();
    int number[] =new int[size];
    System.out.println("enter index of array :");

    for (int i = 0; i < size; i++) {

        number[i]= sc.nextInt();

    }
    System.out.println("enter x value");
    int x= sc.nextInt();

    for (int i = 0; i < number.length; i++) {
        if (number[i]==x){
            System.out.println(" x found at index :"+i);
        }

    }
}
}
