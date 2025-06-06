import java.util.Scanner;

public class Six {
    public static void main(String args[])
    {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int test = num;
        while(num!=0){
            int rem = num%10;
            sum = sum + rem*rem*rem;
            num = num/10;
        }
        if(test == sum){
            System.out.print("it is an armstring number");

        }else{
            System.out.print("it is not an armstring number");
        }
    
    }


    
}
