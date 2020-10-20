package Class_Work;

import java.util.Scanner;

public class even_numBetweenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start value: ");
		int start=sc.nextInt();
		System.out.println("Enter End value: ");
		int end = sc.nextInt();
		System.out.println("Even Number's are: ");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}
