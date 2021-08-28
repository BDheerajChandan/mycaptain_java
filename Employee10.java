/*Write a program that would print the information (name, year of joining, salary, address) of three employees 
  by creating a class named 'Employee'. The output should be as follows:
  
 					Name Year of joining Address Robert 1994 64C- WallsStreet 
 												 Sam 2000 68D- WallsStreet 
 												 John 1999 26B- WallsStreet*/
import java.io.*;
public class Employee10
{
	//String nm;
	//int yr;
	//long sal;
	//String addr;
	public static void information(String name,int year,long salary,String address)
	{
		System.out.println(name+" "+year+" "+salary+" "+address);
	}
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
		String nm;
		int yr;
		long sal;
		String addr;
		for(int i=0;i<3;i++)
		{
			nm=input.readLine();        				//       Robert                 Sam                John
			yr=Integer.parseInt(input.readLine());      //        1994                  2000               1999
			sal=Long.parseLong(input.readLine());       //            
			addr=input.readLine();                      //   64C- WallsStreet     68D- WallsStreet     26B- WallsStreet
			information(nm,yr,sal,addr);
		}
		
	}
}
