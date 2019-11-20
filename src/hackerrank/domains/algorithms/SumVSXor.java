package hackerrank.domains.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumVSXor {

	static long sumXor(long n) {
		long result = 64 - Long.numberOfLeadingZeros(n) - Long.bitCount(n);
		return (long) Math.pow(2, result);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		long n = Long.parseLong(bufferedReader.readLine().trim());

		long result = sumXor(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
