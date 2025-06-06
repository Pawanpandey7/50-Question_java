//print the prime numbers in range
import java.util.Scanner;
public class Seven {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lower end of the range");
        int n1 = sc.nextInt();
        System.out.print("enter the upper end of the range");
        int n2 = sc.nextInt();
        
        while(n1<=n2){
            int sum = 0;
            for(int i=1;i<=n1;i++){
                if(n1%i==0){
                    sum = sum + 1;
                }
            }
            if(sum<=2){
                System.out.print(" "+ n1);
            }
            n1 = n1 + 1;
            
        }
        
      
        

    }

    
}
