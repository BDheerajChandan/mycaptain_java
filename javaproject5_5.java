import java.io.*;
import java.util.*;
public class javaproject5_5 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age=sc.nextInt();
		if(age>20)
			System.out.println("Major");
		else if(age>=18)
			System.out.println("Eligible to vote");
		else 
			System.out.println("Minor");
	}
}
