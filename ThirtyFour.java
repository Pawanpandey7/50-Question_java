
public class ThirtyFour{
    public static int Sum_array(int[] arr,int index)
    {
        
        if(index==arr.length)
        {
            return 0;

        }else{
            return arr[index]+Sum_array(arr,index+1);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        System.out.print(Sum_array(arr,0));
    }
}