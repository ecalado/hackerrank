package hackerrank.domains.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		int kangaroo1 = x1;
		int kangaroo2 = x2;

		for (int i = 0; i < 10000; i++) {

			if (kangaroo1 == kangaroo2) {
				return "YES".toUpperCase();
			} else {
				if (v1 <= v2 && kangaroo1 < kangaroo2) {
					return "NO".toUpperCase();
				}

				kangaroo1 += v1;
				kangaroo2 += v2;
			}
		}

		return "NO".toUpperCase();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
