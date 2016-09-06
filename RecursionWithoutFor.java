package guvi;

import java.util.Scanner;

public class RecursionWithoutFor 
{
	public static void main(String[] args) 
	{
			int n;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the no");
			n=s.nextInt();
			int i=1;
		print(i,n);
			
	
	
}

	private static void print(int i,int n) 
	{	
		if(i!=n+1)
			
		{
			System.out.println(i);
			i++;
			print(i, n);
		}
		
	}
	}
