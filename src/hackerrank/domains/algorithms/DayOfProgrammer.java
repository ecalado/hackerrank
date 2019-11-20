package hackerrank.domains.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DayOfProgrammer {

	static String dayOfProgrammer(int year) {

		String result = "";

		if (year > 1918) {
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(GregorianCalendar.YEAR, year);
			gc.set(GregorianCalendar.DAY_OF_YEAR, 256);

			DateFormat dtFormat = new SimpleDateFormat("dd.MM.yyyy");
			result = dtFormat.format(gc.getTime());
		} else if (year < 1918) {
			if (Math.floorMod(year, 4) == 0) {
				result = "12.09." + year;
			} else {
				result = "13.09." + year;
			}
		} else {
			result = "26.09.1918";
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
