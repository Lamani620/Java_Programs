package programs;

import java.util.*;
public class factUsing_while {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int num=sc.nextInt();
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}
}
