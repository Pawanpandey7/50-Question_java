// program to check if two stings are anagrams(same characters but different order)
import java.util.*;
public class Fifteen
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first string");
        String str1 = sc.nextLine();

        System.out.print("enter the Second string");
        String str2 = sc.nextLine();

        if(checkAnagrams(str1,str2)){
            System.out.print("they are anagrams");

        }else{
            System.out.print("they are not anagrams");
        }
        sc.close();

    }
    public static boolean checkAnagrams(String str1, String str2)
    {
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()) return false;
        //conver strings to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}