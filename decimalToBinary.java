package programs;

public class decimalToBinary {
	public static void main(String[] args) {
		int dec=8;
		int binary=0;
		int rev=1;
		while(dec!=0){
			int rem=dec%2;
			binary=binary+rem*rev;
			rev=rev*10;
			 dec=dec/2;
		}
		System.out.println(binary);
	}
}
