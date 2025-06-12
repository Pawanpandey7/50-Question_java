// implementation of the binary search
import java.util.*;
public class TwentyTwo{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = numbers.size();
        int low = 0;
        int high = n-1;
        boolean result = false;
        while(low<=high){
            int length = (low+high)/2;

            if(numbers.get(length) == num)
            {
                result = true;
                break;
            }else if(numbers.get(length)>num){
                high = length-1;

            }else{
                low = length + 1;
            }
        }
        if(result){
            System.out.print("the number is in the list");
        }else{
            System.out.print("the number is not in the list");
        }
        sc.close();
    }
}