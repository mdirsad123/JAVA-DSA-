package java_DSA_practice;

public class string_reverse {
    public static int first=-1;
    public static int last=-1;
    public static void reverseastring(String str,int index,char element){
        if (index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=str.charAt(index);
        if (current==element){
            if (first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        reverseastring(str,index+1,element);
        return;
    }

    public static void main(String[] args) {
        String str="abaacdaefaah";
        reverseastring(str,0,'a');
    }
}
