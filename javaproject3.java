import java.io.*;
import java.util.*;
public class javaproject3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Minutes : ");
        long min=sc.nextInt();//3456789;
        System.out.println("\nMinutes :"+min);
        long yr=min/(365*24*60); // minutes to years
        System.out.println("Years : "+yr);
        long days=(min/(24*60))%365;    // minutes to days
        System.out.println("Days : "+days);
    }
}