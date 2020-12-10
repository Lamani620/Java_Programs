package programs;

public class fibonicBy_Recursion {
	static int fib1=0;
	static int fib2=1;
	static int fib3=0;
	
	static void printFiboo(int count)
	{
		if(count>0)
		{
			fib3=fib2+fib1;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			printFiboo(count-1);
		}
	}
	public static void main(String[] args) {
		int count=15;
		System.out.print(fib1+" "+fib2+" ");
		printFiboo(count-2);
	}
}
