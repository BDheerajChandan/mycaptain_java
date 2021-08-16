import java.io.*;
import java.util.*;
public class javaproject5_2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=sc.nextInt();
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
