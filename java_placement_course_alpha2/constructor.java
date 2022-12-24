package java_placement_course_alpha2;

public class constructor {
    public static void main(String[] args) {
        constructor s=new constructor(23);
        constructor s1=new constructor(21,45);
    }
    constructor(int x){
        System.out.println(x);
    }
    constructor(int x, int y){
        System.out.println(x+y);
    }
}
