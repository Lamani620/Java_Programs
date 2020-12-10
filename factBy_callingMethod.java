package programs;



public class factBy_callingMethod {
	
	static int factoo(int num)
	{
		if(num==1)
			return 1;
		else 
			return (num*factoo(num-1));
	}
	public static void main(String[] args) {
		System.out.println(factoo(5));
	}
}
