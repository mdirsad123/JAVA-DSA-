package java_placement_course_alpha2;

public class Arrays_2D_Assignment {
    public static void sum2row(int array[][]){
        int sum=0;
        for (int j = 0; j < array[0].length; j++) {
            sum +=array[1][j];
        }
        System.out.println(sum);
    }
    public static int keyTimes(int array[][],int key){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] array =  { {1,4,9},{11,4,3},{2,2,3} };
        int key=8;
//        System.out.println(keyTimes(array,key));
        sum2row(array);

    }
}
