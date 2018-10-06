import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String agm[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
     
        num=sc.nextInt();
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else 
            System.out.println("IT's ZERO.");      
         
    }
}