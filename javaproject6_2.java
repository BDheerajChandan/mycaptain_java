/*Write a java program to print natural numbers using do-while loop*/
import java.io.*;
public class javaproject6_2 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the range : ");
		int n=Integer.parseInt(input.readLine()); //5
		System.out.println();
		int i=1;
		do
		{
			System.out.println(i);
			i=i+1;
		}
		while(i<=n);
	}
}
