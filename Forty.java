//intersection of two arrays
import java.util.*;
public class Forty{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,5,7,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
           
            list.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(list.contains(arr2[j])){
                continue;
            }
            list.add(arr2[j]);
        }
        System.out.print(list);
    }
}