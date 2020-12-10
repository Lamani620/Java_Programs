package programs;

import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start Num: ");
		int start=sc.nextInt();
		System.out.println("Enter end Num: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++)
		{
			int num=i;
			int copy=num;
			int rev=0;
			while(num!=0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(rev==copy)
			{
				System.out.println(i+" is palindrome...");
				count++;
			}
		}
		System.out.println();
		System.out.println(count+" palindromes are thier");
	}
}
