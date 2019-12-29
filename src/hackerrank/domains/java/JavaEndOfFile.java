package hackerrank.domains.java;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (sc.hasNextLine()) {

			System.out.println(count + " " + sc.nextLine());
			count++;
		}
		sc.close();

	}
}
