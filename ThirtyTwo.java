// fibonacci series using recursion in java
public class ThirtyTwo{
    public static void main(String[] args)
    {
        int n = 10;
        for(int i =0;i<10;i++)
        {
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }else if(n==1)
        {
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}