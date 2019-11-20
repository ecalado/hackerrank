package hackerrank.domains.algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class BTSResult {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		List<Integer> list1 = new ArrayList<Integer>();

		int a1 = a.get(a.size() - 1);
		int b1 = b.get(0);

		for (int i = a1; i <= b1; i++) {

			boolean isFactor = true;
			for (int elementA : a) {
				if (Math.floorMod(i, elementA) != 0) {
					isFactor = false;
					break;
				}
			}

			if (isFactor) {
				for (int elementB : b) {
					if (Math.floorMod(elementB, i) != 0) {
						isFactor = false;
						break;
					}
				}

				if (isFactor) {
					list1.add(i);
				}
			}
		}

		return list1.size();
	}

}

public class BetweenTwoSets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = BTSResult.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
