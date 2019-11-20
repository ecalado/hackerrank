package hackerrank.domains.algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		double ratioPositive = 0;
		double ratioNegative = 0;
		double ratioZero = 0;

		int lines = arr.length;
		for (int number : arr) {
			if (number == 0) {
				ratioZero++;
			} else if (number > 0) {
				ratioPositive++;
			} else {
				ratioNegative++;
			}
		}

		ratioZero = ratioZero / lines;
		ratioPositive = ratioPositive / lines;
		ratioNegative = ratioNegative / lines;

		DecimalFormat decimal = new DecimalFormat("#.000000");

		System.out.println(decimal.format(ratioPositive));
		System.out.println(decimal.format(ratioNegative));
		System.out.println(decimal.format(ratioZero));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
