package java_placement_course_alpha2;

public class String_ConvertToUpperCase {
    public static String convertToUpperCase(String str){
        StringBuffer sb=new StringBuffer("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hi, i am md irsad";
        System.out.println(convertToUpperCase(str));
    }
}
