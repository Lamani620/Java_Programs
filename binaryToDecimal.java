package programs;

import java.util.*;

public class binaryToDecimal {
	static int converter(int binary) {
		int dec = 0;
		int mul = 1;
		while (binary != 0) {
			int rem = binary % 10;
			dec = dec+mul*rem;
			mul*=2;
			binary = binary / 10;
		}
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any binary Number: ");
		int binary = sc.nextInt();

		System.out.println(converter(binary));

	}
}
