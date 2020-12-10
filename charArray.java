package programs;

import java.util.Scanner;

public class charArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value for "+i+" index");
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("Index\tValues");
		for(int i=0;i<arr.length;i++)
			System.out.println(i+"\t"+arr[i]);
	}
}
