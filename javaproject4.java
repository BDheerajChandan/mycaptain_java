import java.io.*;
public class javaproject4
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.print("Enter Minutes : ");
        long min=Long.parseLong(input.readLine());//3456789;
        System.out.println("\nMinutes :"+min);
        long yr=min/(365*24*60); // minutes to years
        System.out.println("Years : "+yr);
        long days=(min/(24*60))%365;    // minutes to days
        System.out.println("Days : "+days);
    }
}