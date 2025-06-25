//to find the duplicates in an array
import java.util.*;
public class ThirtyNine{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,1,3,4,4,5,6,7,5));
        findDuplicates(arr);
    }
    public static void findDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            if(list.contains(arr.get(i))){
                continue;
            }
            for(int j=i+1;j<arr.size();j++){  
                if(arr.get(i)==arr.get(j) && !(list.contains(arr.get(j)))){
                    list.add(arr.get(j));
                }
            }
        }
        System.out.print(list);
    }
}