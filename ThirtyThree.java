// power of a number using recursion
import java.util.Scanner;
public class ThirtyThree{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int a = sc.nextInt();
        System.out.print("how much you want to power it: ");
        int b = sc.nextInt();

        System.out.print(pow(a,b));
    }
    public static int pow(int a,int b)
    {
        if(b==0){
            return 1;
        }else{
            return a*pow(a,b-1);
        }
    }
}