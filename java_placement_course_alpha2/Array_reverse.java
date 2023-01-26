package java_placement_course_alpha2;

public class Array_reverse {
    public static void main(String[] args) {
        int arr[]={5,6,3,7,5,45};
        int first= 0;
        int last=arr.length-1;
        while (first<last){
            int swap=arr[first];
            arr[first]=arr[last];
            arr[last]=swap;
            first++;
            last--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
