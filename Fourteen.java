// reverse a string
import java.util.*;
public class Fourteen{
    public static void main(String[] args)
    {
        String str = "pawan";
        int n = str.length();
        String rev = "";
        for (int i = n-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);

        }
        System.out.print(rev);
    }
}