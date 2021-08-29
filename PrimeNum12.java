/*check if any given input number is prime or not.*/
import java.io.*;
public class PrimeNum12
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the number : ");
		int n=Integer.parseInt(input.readLine()); //3
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
