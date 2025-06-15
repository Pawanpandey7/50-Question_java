//insertion sort
import java.util.*;
public class TwentyFive{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,2,7,5,6));
        int n = numbers.size();
        int min;
        for(int i = 1;i<n;i++)
        {
            int check = numbers.get(i);
            min = i;
            for(int j = i-1;j>=0;j--)
            {
                if(numbers.get(i)<numbers.get(j))
                {
                    min = j;
                }
            }
            if(min!=i){
                numbers.remove(i);
                numbers.add(min,check);
                
            }
        }
        System.out.print(numbers);

    }
}
