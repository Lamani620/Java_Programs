package Class_Work;

import java.util.Scanner;

public class primeORnot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				flag = true;
		}
		if (flag == true)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not a prime");
	}
}
