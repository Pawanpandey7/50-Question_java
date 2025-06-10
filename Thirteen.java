// program to sort the list
import java.util.*;
public class Thirteen{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(3,4,2,1,6,5);
        int n = numbers.size();
        for(int i=n-1;i>0;i--)
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
        System.out.print("the sorted list is: ");
        System.out.print(numbers);
    }
}