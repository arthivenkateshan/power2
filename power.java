package lb35;

import java.util.Scanner;

public class power {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int h=0;
	int d=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			int c=a[i]+a[j];
			
			for(h=1;h<=Math.pow(10,5);h++)
			{
			if(c==Math.pow(2,h))
			{
				d++;	
			}
				
			}
		}
	}
	System.out.println(d);

	}

}
