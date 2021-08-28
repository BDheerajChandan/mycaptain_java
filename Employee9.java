/*Write a program that would print the information (name, year of joining, salary, address) of three employees 
  by creating a class named 'Employee'. The output should be as follows:
  
 					Name Year of joining Address Robert 1994 64C- WallsStreet 
 												 Sam 2000 68D- WallsStreet 
 												 John 1999 26B- WallsStreet*/
import java.io.*;
import java.util.*;
public class Employee9
{
	//String nm;
	//int yr;
	//long sal;
	//String addr;
	public static void information(String name,int year,long salary,String address)
	{
		System.out.println(name+" "+year+" "+salary+" "+address);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String nm;
		int yr;
		long sal;
		String addr;
		for(int i=0;i<3;i++)
		{
			nm=sc.next();        //       Robert                 Sam                John
			yr=sc.nextInt();     //        1994                  2000               1999
			sal=sc.nextLong();   //            
			addr=sc.next();      //   64C- WallsStreet     68D- WallsStreet     26B- WallsStreet
			information(nm,yr,sal,addr);
		}
		
	}
}
