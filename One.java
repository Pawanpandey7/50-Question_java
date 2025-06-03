// even or odd
public class One{
    public static void main(String[] args)
    {
        int num = 17;
        even_odd(num);
    }
    public void even_odd(int num)
    {
        if(num%2==0){
            System.out.print("it is even");

        }
        else{
            System.out.print("it is odd");
        }
    }
}