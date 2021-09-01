/*Write a java program to check age and print Major if age is >20 , print eligible to vote is age is >=18 else print Minor.*/
import java.io.*;
public class javaproject6_5 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the age : ");
		int age=Integer.parseInt(input.readLine()); //21
		if(age>20)
			System.out.println("Major");
		else if(age>=18)
			System.out.println("Eligible to vote");
		else 
			System.out.println("Minor");
	}
}
