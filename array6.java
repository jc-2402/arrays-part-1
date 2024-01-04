// reverse by swapping
import java.util.*;

public class array6{
    public static void reverse(int arr[]){
       int first = 0;
       int last = arr.length - 1;

       while(first <last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
        first++;
        last--;
       }
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4};
        reverse(arr);// call
        //print
        System.out.print("reverse array is : ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
