import java.io.*;
import java.util.*;
public class javaproject5_7 
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