import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char input=s.charAt(0);
        if(input>=65 && input<=90)
        {
            System.out.println("1");
        }
        else if(input>=97 && input<=122)
        {
             System.out.println("0");
        }
        else
        {
             System.out.println("-1");
        }

    }
}