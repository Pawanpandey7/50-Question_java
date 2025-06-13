// implementation of the bubble sort
import java.util.*;
public class TwentyThree{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,1,4,7,6,5));
        int n = numbers.size();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(numbers.get(j)>numbers.get(j+1))
                {
                    int temp = numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,temp);
                }
            }
        }
        System.out.print(numbers);

    }
}