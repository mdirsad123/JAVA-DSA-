package java_placement_course_alpha2;

public class Distinct_Or_Not {
    public static boolean distinct_orNot(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,5,11,6,8};
        System.out.println(distinct_orNot(arr));
    }
}
