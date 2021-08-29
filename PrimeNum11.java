/*check if any given input number is prime or not.*/
import java.io.*;
import java.util.*;
public class PrimeNum11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		System.out.println();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println(n+" is a prime number");
		}else{
			System.out.println(n+" is not a prime number");
		}
	}
}
