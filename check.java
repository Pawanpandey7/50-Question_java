import java.util.*;


public class check {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,5));

        list.add(2);
        list.remove(valueOf(2));
        System.out.print(list);
    }
        
}