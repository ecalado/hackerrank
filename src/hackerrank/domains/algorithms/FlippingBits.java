package hackerrank.domains.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FlippingBits {

	static long flippingBits(long n) {

		String in = Long.toBinaryString(n);
		StringBuffer inn = new StringBuffer();

		for (int i = 0; i < 32 - in.length(); i++) {
			inn.append(0);
		}
		inn.append(in);

		StringBuffer out = new StringBuffer();
		int i = 0;
		while (i < inn.length()) {
			int x = Character.getNumericValue(inn.codePointAt(i));
			out.append(Math.abs(x - 1));
			i++;
		}

		return Long.parseLong(out.toString(), 2);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			long n = scanner.nextLong();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			long result = flippingBits(n);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
