package programs;

import java.util.Scanner;;
public class evenNumber_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int count=0;
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value for "+i+" index");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Index\tValues");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t"+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum=evenSum+arr[i];
			}else{
				oddSum=oddSum+arr[i];
			}
			
		}
		System.out.println("Sum of even number = "+evenSum);
		System.out.println("Sum of odd Number= "+oddSum);
		double avg=((evenSum+oddSum)*1.0)/size;
		System.out.println("Average of Num= "+avg);
	}
	
}
