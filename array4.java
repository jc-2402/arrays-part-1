// find largest n smallest in array 
import java.util.*;
public class array4{
    public static void main(String args[]){
        int arr[] ={1,3, 5, 8, 9,10};
        System.out.println("largest si = "+ largest(arr));
    }
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(largest < arr[i]){
                largest= arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest is = "+smallest);
        return largest;
    }
}