package java_DSA_practice;

import java.util.Scanner;

public class take_input_pt_sum {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a=st.nextInt();
        int b=st.nextInt();
        int sum=a+b;
        System.out.println("sum is = "+sum);
    }
}
