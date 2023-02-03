package java_placement_course_alpha2;

public class Decimal_To_Binary {
    public static int decimalToBi(int dec){
        int p=0;
        int bin=0;
        while (dec>0){
            int rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10,p));
            dec=dec/2;
            p++;
        }
        return bin;
    }
    public static void factorial(int f){
        int fac=1;
        for (int i = 1; i <= f; i++) {
            fac =fac*i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {

        int dec=5;
//        System.out.println(decimalToBi(dec));
        factorial(dec);
    }
}
