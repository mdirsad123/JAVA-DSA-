package java_placement_course_alpha2;

public class subArray {
    public static void subarr(int arr[]){
        int coun=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]+" ");

                }
                coun++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total count is = "+coun);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarr(arr);
    }
}
