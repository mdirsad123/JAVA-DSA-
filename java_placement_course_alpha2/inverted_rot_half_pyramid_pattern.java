package java_placement_course_alpha2;

public class inverted_rot_half_pyramid_pattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
