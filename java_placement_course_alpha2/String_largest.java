package java_placement_course_alpha2;

public class String_largest {
    public static void main(String[] args) {
        String fruit[]={"apple","mango","zanana"};
        String largest=fruit[0];
        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
}
