public class Four {

    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int n = 10;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<n-1;i++)
        {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
