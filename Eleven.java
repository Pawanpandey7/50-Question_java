//find the largest element in the list
import java.util.List;
import java.util.ArrayList;
public class Eleven {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(20);
        numbers.add(30);
        int n = numbers.size();
        int greatest = numbers.get(0);
        for(int i = 0;i<n;i++)
        {
            if(numbers.get(i)>greatest)
            {
                greatest = numbers.get(i);
            }
        }
        System.out.print("the greatest number in the list is "+greatest);
    }
}
