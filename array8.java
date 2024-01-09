//print subarrays and their sum
import java.util.*;

public class array8{
    public static void subarrays(int num[]){
        int tp =0;
        int sum =0;
        for(int i = 0; i<num.length; i++){//start
            for(int j=i; j<num.length; j++){//end
                sum =0;
                for(int k=i ; k<=j ; k++){//print
                    System.out.print(num[k]+" ");
                    sum += num[k];
                }
                tp++;
                 System.out.println();
                System.out.println("sum ="+sum);
            }
            System.out.println();
        }
       
        System.out.println("total num of subarrays = "+tp);
    }
    public static void main(String args[]){
        int num[] ={2,4,6,8,10};
        subarrays(num);
    }
}