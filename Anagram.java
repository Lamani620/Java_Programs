package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static String anaGram(char[] arr1, char[] arr2){
		if(Arrays.equals(arr1, arr2))
			return "Given string are Anagram";
		else
			return "not a anagram";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st string value: ");
		String s1=sc.next();
		System.out.println("Enter 2nd String value: ");
		String s2=sc.next();
		
		char arr[]=s1.toCharArray();
		char abb[]=s2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(abb);
		
		System.out.println(anaGram(arr,abb));
		
	}
}
