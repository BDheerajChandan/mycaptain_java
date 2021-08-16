import java.io.*;
import java.util.*;
public class javaproject5_4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("Eligible to vote");
		else 
			System.out.println("Not eigible to vote");
	}
}
