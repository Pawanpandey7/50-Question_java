// to check prime numbe or not
import java.util.Scanner;
public class Two{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=num;i++)
        {
            if(num%i==0){
                sum = sum + 1;
            }
        }
        if(sum>2){
            System.out.print("it is the composite number");
        }
        else{
            System.out.print("it is the prime number");
        }
    }
}