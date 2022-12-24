package java_DSA_practice;

public class Tower_of_honoi {
    public static int towerofhanoi(int n, String sr, String helper, String dest){
        if (n==1){
            System.out.print("transfer disk"+n+" from "+sr+ " to "+dest+" : ");
            return 0;
        }
        towerofhanoi(n-1,sr,dest,helper);
        System.out.println("transfer disk"+n+" from "+sr+" to "+dest+" : ");
        towerofhanoi(n-1,helper,sr,dest);
        return 0;
    }

    public static void main(String[] args) {
        int n=4;
        int ans=towerofhanoi(n,"S", "H", "D");
        System.out.println(ans);
    }
}
