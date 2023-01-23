package java_placement_course_alpha2;

public class String_shortestPath {
    public static double shortestPath(String path){
        int x=0;
        int y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            if (dir=='N'){
                y++;
            } else if (dir=='S') {
                y--;
            } else if (dir=='E') {
                x++;
            }
            else {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
