// gcd of two numbers
import java.util.Scanner;
public class Eight {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 =sc.nextInt();
        System.out.println("Enter the second number");
        int n2 =sc.nextInt();
        int greatest = 1;
        for (int i = 1; i<=Math.min(n1,n2);i++)
        {
            if (n1%i==0 && n2%i==0){
                greatest = i;
            }
        }
        System.out.println("the gcd of "+n1+" and "+n2+" is "+greatest);
    }

    
}
