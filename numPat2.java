package programs;

public class numPat2 {
	public static void main(String[] args) {
		int num=18;
		int n1=0;
		for(int i=0;i<=num;i++)
		{
			if(i<num/2)
			{
				System.out.print(n1+" ");
				n1++;
			}else{
				System.out.print(n1+" ");
				n1--;
			}
		}
	}
}
