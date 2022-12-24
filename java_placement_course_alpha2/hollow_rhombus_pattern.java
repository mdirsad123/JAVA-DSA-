package java_placement_course_alpha2;

public class hollow_rhombus_pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i>=2 && j>=2 && i<=(n-1) && j<=(n-1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
