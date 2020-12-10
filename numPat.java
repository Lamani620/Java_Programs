package programs;

import java.util.*;
public class numPat {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NO: ");
		int n=sc.nextInt();
		int val=1;
		int start=1;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=start;j++)
			{
				if(j%2==1)
				{
					System.out.print(val+" ");
					val++;
				}
				else
					System.out.print("* ");
			}
			System.out.println();
			start=start+2;
			
		}
	}
}
