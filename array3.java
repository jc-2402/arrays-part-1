//linear search in arrays
// create a menu and find samosa
import java.util.*;
public class array3{
    public static void main (String args[]){
        String arr[] ={"tea","coffee","samosa","maggie","pizza"};
        String key = "samosa";

        int index =  linearsearch(arr,key);

        if(index == -1){
            System.out.println("not found :( ");
        }
        else{
            System.out.println("samosa found at item no - "+index);
        }

    }
    public static int linearsearch(String arr[], String key){
        for(int i =0; i<= arr.length ; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1; // means not found
    }
}

