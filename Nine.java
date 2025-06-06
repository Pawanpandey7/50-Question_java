//count the digits of the number
import java.util.Scanner;

public class Nine {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            count = count + 1;
            num = num/10;
        }
        System.out.print(count);
    }
    
}
