package programs;

import java.util.Scanner;
public class reverseString {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String: ");
	String s1=sc.next();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
		s2=s2+s1.charAt(i);
	if(s2.equals(s1))
		System.out.println("palindrome");
	else
		System.out.println("Not palindrome");
}
}
