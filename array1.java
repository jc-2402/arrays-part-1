// array operations - 1) create 2)input & o/p 3) update 4) per 5)get length
import java.util.*;
public class array1{
    public static void main(String args[]){
        int marks[] = new int [100]; //creation with 100 size
        // I/p 
        Scanner s = new Scanner(System.in);
        marks[0] = s.nextInt();
        marks[1] = s.nextInt();
        marks[2] = s.nextInt();
        // o/p
        System.out.println("phy = "+marks[0]);
        System.out.println("chem = "+ marks[1]);
        System.out.println("math = "+marks[2]);
        //update 
        marks[1] = 99;
        marks[2] = marks[2] + 1;
        System.out.println("updated marks of chem = "+marks[1]);
        System.out.println("updated marks of math = "+marks[2]);
        //per
        int per = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage = "+per+ "%");
        // length 
        System.out.println("length of array = "+ marks.length);

        }
}