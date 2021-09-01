/*Write a java program to check eligibility to vote or not.*/
import java.io.*;
public class javaproject6_4 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the age : ");
		int age=Integer.parseInt(input.readLine()); //21
		if(age>=18)
			System.out.println("Eligible to vote");
		else 
			System.out.println("Not eigible to vote");
	}
}
