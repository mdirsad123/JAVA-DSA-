package java_placement_course_alpha2;

public class Array_subArray {
    public static void pairArray(int arr[]){
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+", "+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair is "+tp);
    }
    public static void subArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,5,2,8,9};
//        pairArray(arr);
        subArray(arr);
    }
}
