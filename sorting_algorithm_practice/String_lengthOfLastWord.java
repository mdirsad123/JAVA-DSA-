package sorting_algorithm_practice;

public class String_lengthOfLastWord {
    public static int lengthOfLastWord(String str){
        str=str.trim();
        String arr[]=str.split("\\str+");
        return arr[arr.length-1].length();
    }
    public static void main(String[] args) {
        String str="hi i am md irsad ";
        System.out.println(lengthOfLastWord(str));
    }
}
