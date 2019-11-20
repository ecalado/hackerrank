package hackerrank.domains.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheGreatXor {

	// Complete the theGreatXor function below.
	static long theGreatXor(long x) {
		return (1L << (64 - Long.numberOfLeadingZeros(x))) - 1 - x;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			long x = scanner.nextLong();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			long result = theGreatXor(x);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
