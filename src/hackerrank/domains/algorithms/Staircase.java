package hackerrank.domains.algorithms;

import java.util.Scanner;

public class Staircase {

	static void staircase(int n) {
		String symbol = "#";
		String blank = " ";
		for (int i = 0; i < n; i++) {
			blank += " ";
		}

		int i = 0;
		do {
			i++;
			System.out.println(blank.substring(i, n) + symbol);
			symbol += "#";
		} while (i < n);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
