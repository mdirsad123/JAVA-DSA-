package java_placement_course_alpha2;

public class kadans_maxSubArray {
    public static int kadans(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i < numbers.length; i++) {
            cs +=numbers[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        return  ms;
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,3};
        System.out.println("max sub array : "+kadans(numbers));
    }
}
