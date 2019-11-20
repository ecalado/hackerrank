package hackerrank.domains.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
		DateFormat dtFormat = new SimpleDateFormat("hh:mm:ssa");
		DateTimeFormatter dtTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

		try {
			dtFormat.parse(s);
		} catch (ParseException e) {
			return "";
		}

		LocalTime localTime = LocalTime.of(dtFormat.getCalendar().get(Calendar.HOUR_OF_DAY),
				dtFormat.getCalendar().get(Calendar.MINUTE), dtFormat.getCalendar().get(Calendar.SECOND));

		return dtTimeFormat.format(localTime);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
