/*Write a java program to print "Hi", "Hey", "Hello" for user choice using switch case statements else print "Invalid choice"*/
import java.io.*;
public class javaproject6_6 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the choice : ");
		int ch=Integer.parseInt(input.readLine()); //2
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