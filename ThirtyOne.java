//factorial of a number using recursion
import java.util.*;
class Parent{
    public static int Fact(int n)
    {
        if(n==0) return 1;
        if(n==1) return 1;
        return n*Fact(n-1);
    }
    public static void main(String[] args)
    {
        System.out.print("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The factorial of "+n +" is "+Fact(n));
        
    }
   
}
