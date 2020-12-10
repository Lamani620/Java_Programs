package programs;

public class numPat1 {
	public static void main(String[] args) {
		int n1=1;
		int n2=10;
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.print(n1+" ");
				n1++;
			}else{
				System.out.print(n2+" ");
				n2--;
			}
		}
	}
}
