import java.io.*;
import java.util.*;
public class javaproject5_6 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the choice : ");
		int ch=sc.nextInt();
		System.out.println();
		switch(ch)
		{
			case 1:
				System.out.println("Hi");
				break;
			case 2:
				System.out.println("Hey");
				break;
			case 3:
				System.out.println("Hello");
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}