// factorial of a number
import java.util.Scanner;
public class Three 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int num = sc.nextInt();
        System.out.print(fact(num));
        sc.close();
    }
    public static int fact(int num)
    {
        if(num==1 || num==0){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
}