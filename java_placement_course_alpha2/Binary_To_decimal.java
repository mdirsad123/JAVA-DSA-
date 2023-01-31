package java_placement_course_alpha2;

public class Binary_To_decimal {
    public static int binaryToDecimal(int n){
        int p=0;
        int dec=0;
        while (n>0){
            int lastD=n%10;
            dec = (int) (dec + (lastD*Math.pow(2,p)));
            n=n/10;
            p++;
        }
        return dec;
    }
    public static void main(String[] args) {
        int n=111;
        System.out.println(binaryToDecimal(n));
    }
}
