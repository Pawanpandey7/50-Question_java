// check if the string is palindrome
import java.util.*;
public class Eighteen{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
    
        int n = str.length();
        String sum = "";
        for(int i = n-1;i>=0;i--)
        {
            sum = sum + str.charAt(i);

        }
        if(sum.equals(str)){ 
            System.out.print("it is palindrome");
        }else{
            System.out.print("it is not palindrome");
        }


    }
       
        
    
 
}