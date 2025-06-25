// first non-repeating character in a sting
import java.util.*;
public class ThirtyEight{
    public static void main(String[] args){
        String str = "papawan";
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                String rem = arr[i];
                list.remove(rem);
            }else{
                list.add(arr[i]);
            }
        }
        System.out.print(list.get(0));
    }
    
}