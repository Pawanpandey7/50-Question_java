// check palindrome number
import java.util.Scanner;
public class Five {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num= sc.nextInt();
        int check = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if(check==sum){
            System.out.print("it is palindrome");

        }else{
            System.out.print("it is not palindrome");
        }


    }
    
}
