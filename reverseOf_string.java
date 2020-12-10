package programs;

import java.util.Scanner;

public class reverseOf_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				String s2=arr[i];
				String s3="";
				for(int j=s2.length()-1;j>=0;j--)
					s3=s3+s2.charAt(j);
				System.out.print(s3+" ");
			}else{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
