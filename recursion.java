package programs;

public class recursion {
	static int count=0;
	static void poo()
	{
		count++;
		if(count<=5)
		{
			System.out.println("hello "+count);
			poo();
		}
	}
	public static void main(String[] args) {
		poo();
	}
}
