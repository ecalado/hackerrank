package hackerrank.domains.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {

	/*
	 * Complete the pageCount function below.
	 */
	static int pageCount(int n, int p) {
		/*
		 * Write your code here.
		 */
		int result = 0;
		int calc = n - p;

		if (p <= calc) {
			result = p / 2;
		} else {
			if (p == n - 1 && Math.floorMod(n, 2) == 0) {
				result = 1 + calc / 2;
			} else {
				result = calc / 2;
			}

		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int p = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int result = pageCount(n, p);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
