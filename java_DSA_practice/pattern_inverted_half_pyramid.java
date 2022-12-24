package java_DSA_practice;

public class pattern_inverted_half_pyramid {
    public static void main(String[] args) {
//        for (int i = 4; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
