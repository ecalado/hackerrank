package hackerrank.domains.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		int result = 0;
		int steps = 0;

		String direction = "S";

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("D")) {
				if (steps == 0) {
					direction = "D";
				}
				steps--;

			} else {
				if (steps == 0) {
					direction = "U";
				}
				steps++;
			}

			if (steps == 0 && direction.equals("D")) {
				result++;
			}
		}
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
