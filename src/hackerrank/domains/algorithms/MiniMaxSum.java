package hackerrank.domains.algorithms;

import java.util.Scanner;

public class MiniMaxSum {

	static void miniMaxSum(int[] arr) {
		int max = 0;
		int min = 0;
		long sum = 0;

		int i = 0;
		do {
			if (i == 0 || min > arr[i]) {
				min = arr[i];
			}

			if (i == 0 || max < arr[i]) {
				max = arr[i];
			}
			sum += arr[i];

			i++;
		} while (i < arr.length);

		System.out.println((sum - max) + " " + (sum - min));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}