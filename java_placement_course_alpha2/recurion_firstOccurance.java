package java_placement_course_alpha2;

public class recurion_firstOccurance {
    public static int firstoccurance(int arr[],int key, int i){
        if (i== arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstoccurance(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,2,6,8,4};
        int key=4;
        System.out.println(firstoccurance(arr,key,0));

    }
}
