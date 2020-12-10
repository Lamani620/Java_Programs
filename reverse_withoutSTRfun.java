package programs;

import java.util.Scanner;

public class reverse_withoutSTRfun {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s1=sc.next();
		char arr[]=s1.toCharArray();
		String s2="";
		for(int i=arr.length-1;i>=0;i--)
		{
			s2=s2+arr[i];
		}
		System.out.print(s2);
		
	}
}
