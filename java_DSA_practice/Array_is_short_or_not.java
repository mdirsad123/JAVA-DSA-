package java_DSA_practice;

public class Array_is_short_or_not {
    public static boolean carray(int array[],int index){
        if (index== array.length-1){
            return true;
        }
        if (array[index]<array[index+1]){
            return carray(array,index+1);

        }
        else
            return false;
    }

    public static void main(String[] args) {
        int array[]={1,37,4,54};
        int index =0;
        System.out.println(carray(array,index));
    }
}
