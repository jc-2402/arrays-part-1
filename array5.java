// binary search in arr
import java.util.*;
public class array5{
    public static void main(String args[]){
        int arr[] ={2,4 ,5, 7, 8, 9};
        int key = 7;
        System.out.println("index found at key "+bs(arr , key));
    }
    public static int bs(int arr[], int key){
        int start = 0;
        int end = arr.length-1; //0th indexing
        while(start <= end){
            int mid = (start + end)/2;
            //compare
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid] < key) { //right
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}