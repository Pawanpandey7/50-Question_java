//two sum problem 
import java.util.*;
public class ThirtySeven
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int target = 9;
        int temp;
        ArrayList<Integer> list = new ArrayList<>();
        boolean found = false;
        
        for(int i =0;i<arr.length;i++)
        {
            temp = target - arr[i];
            for(int num : arr){
                if(num == temp)
                {
                    list.add(temp);
                    list.add(arr[i]);
                    found = true;
                    break;

                }
            }
            if(found){
                break;
            }

        }
        System.out.print(list);

    }

}