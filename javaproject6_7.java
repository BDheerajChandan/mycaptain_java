/*Write a java program to print days of a week according to user choice  using switch case statements else print "Invalid choice"*/
import java.io.*;
public class javaproject6_7 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the choice : ");
		int ch=Integer.parseInt(input.readLine()); //4
		System.out.println();
		switch(ch)
		{
			case 1:
				System.out.println(ch+"st DAY OF WEEK : MONDAY");
				break;
			case 2:
				System.out.println(ch+"nd DAY OF WEEK : TUESDAY");
				break;
			case 3:
				System.out.println(ch+"rd DAY OF WEEK : WEDNESDAY");
				break;
			case 4:
				System.out.println(ch+"th DAY OF WEEK : THURSDAY");
				break;
			case 5:
				System.out.println(ch+"th DAY OF WEEK : FRIDAY");
				break;
			case 6:
				System.out.println(ch+"th DAY OF WEEK : SATUARDAY");
				break;
			case 7:
				System.out.println(ch+"th DAY OF WEEK : SUNDAY");
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}