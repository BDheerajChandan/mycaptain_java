/*Write a java program to print natural numbers using for loop*/
import java.io.*;
public class javaproject6_3 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the range : ");
		int n=Integer.parseInt(input.readLine()); //5
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
