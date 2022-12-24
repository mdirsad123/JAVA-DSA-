package java_placement_course_alpha2;

import java.util.Stack;

public class Stack_maxArea_histogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        //find nsr
        Stack<Integer> s=new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }if (s.isEmpty()){
                nsr[i]= arr.length;
            }
            else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //find nsl
        s=new Stack<>();
        for (int i = 0; i <= arr.length-1; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }if (s.isEmpty()){
                nsl[i]= -1;
            }
            else {
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area
        for (int i = 0; i < arr.length; i++) {
            int height=arr[i];
            int width=nsr[i]=nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("max area is historam is "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,4};//hight of histogram
        maxArea(arr);
    }
}
