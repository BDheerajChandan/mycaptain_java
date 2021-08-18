/*If you create 2 matrices in java as follows, int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
 * 											   int b[][]={{1,3,4},{2,4,3},{1,2,4}};

Your output should look like this,				2 6 8 4 8 6 4 6 9
*/
import java.io.*;
public class javaproject7 
{
	public static void main(String args[])
	{
		int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		int sum;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=a[i][j]+b[i][j];
				System.out.print(sum+" ");
			}
		}
	}
}
