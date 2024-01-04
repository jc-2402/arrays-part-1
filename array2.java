//function in array
//arrays use call by reference(if change happens in function then change is seen in main)
//create a function by passing array as agrument to increase marks by 1
import java.util.*;
public class array2{
    public static void update(int marks[]){ // array named marks is passed as argument
          for(int i=0; i<marks.length ;i++){
            marks[i] = marks[i] + 1;
          }
    }
    public static void main(String args[]){
        int marks[] = {90, 91, 92};
        update(marks);
        // to print array
        System.out.println("updated marks are : ");
        for(int i =0; i<marks.length ;i++){
            System.out.print(marks[i]+" ");
        }
    }

}