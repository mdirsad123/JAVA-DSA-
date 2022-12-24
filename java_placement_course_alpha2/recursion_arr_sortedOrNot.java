package java_placement_course_alpha2;

public class recursion_arr_sortedOrNot {
    public static boolean sortedOrNot(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }

        return sortedOrNot(arr,i+1);
    }
    public static int firstOccurance(int arr[],int key,int i){
        if (i== arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurance(arr,key,i+1);
    }
    public static int lastoccurrence(int arr[],int key,int i){
        if (i== arr.length){
            return -1;
        }
        int isfound=lastoccurrence(arr,key,i+1);
        if (isfound== -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static int xpower(int x, int n){
        if (n==0){
            return 1;
        }
        int xp=xpower(x,n-1);
        int power=x*xp;
        return power;
    }
    public static int powerOptimized(int x ,int n){
        if (n==0){
            return 1;
        }
//        int halfpowersq=optimizedpower(x,n/2)*optimizedpower(x,n/2);
        int halfPower=powerOptimized(x,n/2);
        int halfPowersq=halfPower*halfPower;
        if (n%2 !=0){
            halfPowersq *=x;
        }
        return halfPowersq;
    }
    public static int tilesproblem(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fnm1=tilesproblem(n-1);
        int fnm2=tilesproblem(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sortedOrNot(arr,0));
    }
}
