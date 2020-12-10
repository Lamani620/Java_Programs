package programs;

import java.util.*;
public class digitSum {
	/*static void sum(int Num)
	{
		int sum=0;
		while(Num!=0)
		{
			int rem=Num%10;
			sum=sum+rem;
			Num=Num/10;
		}
		System.out.println(sum);
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int Num=sc.nextInt();
		int copy=Num;
		int len=0;
		int sum=0;
	
	/*	while(Num!=0)
		{
			int rem=Num%10;
			sum=sum+rem;
			Num=Num/10;
		}*/
		
		
		while(copy!=0){
			copy=copy/10;
			len++;
		}
		for(int i=1;i<=len;i++)
		{
			
			
				int rem=Num%10;
				sum=sum+rem;
				Num=Num/10;
			
		}
		System.out.println(sum);
			
	}
}
