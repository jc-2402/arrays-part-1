// max sum of subarrays
import java.util.*;
public class array9{
    public static void maxsumofarray(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length;j++){
                currsum= 0;
                for(int k=i; k<=j; k++){
                    currsum += num[k];
                   
                }
                 System.out.println(currsum);
                 if( currsum > maxsum){
                    maxsum = currsum;
                 }
            }
        }
        System.out.println("max sum is "+maxsum);
    }
    public static void main(String args[]){
        int num[] = {1,-2,6,-1,3};
        maxsumofarray(num);
    }
}