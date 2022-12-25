package java_placement_course_alpha2;

public class Merge_sort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si, int ei){
        //base case
        if (si>=ei){
            return;
        }
        //find mid
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while (j<=ei){
            temp[k++]=arr[j++];
        }
        
        //copy temp to origin arr
        for (k=0, i=si; k<temp.length; k++,i++) {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,1,6,9,4,0,8};
        mergeSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
