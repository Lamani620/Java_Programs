package programs;

import java.util.Scanner;

public class factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value: ");
		int start = sc.nextInt();
		System.out.println("Enter end value: ");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			System.out.print("factors of " + i + " = ");
			for (int j = 1; j < i ; j++) {
				if (i % j == 0)
					System.out.print( j + " ");
			}
			System.out.println();

		}

	}
}
