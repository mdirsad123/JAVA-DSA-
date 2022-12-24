package java_placement_course_alpha2;

public class recursion_TilesProblem {
    public static int tilesproblem(int n){//floar sizes 2Xn
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //task
        int fnm1=tilesproblem(n-1);
        int fnm2=tilesproblem(n-2);
        int ways=fnm2+fnm1;
        return ways;

    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(tilesproblem(n));
    }
}
