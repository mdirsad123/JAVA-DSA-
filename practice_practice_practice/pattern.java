package practice_practice_practice;

public class pattern {
    public static void main(String[] args) {
        int n=6;
        int px=n;
        int py=n;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n*2; j++) {
                int alph=65;
                if (j==px || py==j){
                    System.out.print((char) (i+alph));
                }
                else
                    System.out.print(" ");
            }
            px--;
            py++;
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n*2; j++) {
                int alph=65;
                if (j==px || py==j){
                    System.out.print((char) (i+alph));
                }
                else
                    System.out.print(" ");
            }
            px--;
            py++;
            System.out.println();
        }
        return;
    }
}
