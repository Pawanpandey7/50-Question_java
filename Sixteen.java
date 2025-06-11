//to remove the duplicates from the list 

//importing the necessary library
import java.util.*;

public class Sixteen{
    public static void main(String[] args)
    {
        //creating the list 
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,5));

        //creating the sets
        Set<Integer> unique = new LinkedHashSet<>(numbers);

        //again converting the set into the list by assing the values of the unique variable to the unique
        numbers = new ArrayList<>(unique);

        //Printing the unique number
        System.out.println(numbers);

        
    }
}