// implementation of the linear search
import java.util.*;
public class TwentyOne{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num = sc.nextInt();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int n = numbers.size();
        boolean result = false;
        for(int i=0;i<n;i++)
        {
            if(num == numbers.get(i)){
                result = true;
                break;
            }
        }
        if(result){
            System.out.print("it is in the list");
        }else{
            System.out.print("it is not in the list");
        }
        sc.close();
    }
}