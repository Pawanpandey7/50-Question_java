import java.util.*;
public class TwentyFour{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,2,7,4,6,5));
        int n = numbers.size();
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {    
                if(numbers.get(min)>numbers.get(j))
                {
                    min = j;

                }
            }
            Collections.swap(numbers,i,min);

        }
        System.out.print(numbers);
    }
}