package hackerrank.domains.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {

	static String pattern = "([0-2]*[0-9]*[0-5]*{2}.){3}[0-2][0-5]*{2}";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher("000.12.12.034");  
		System.out.println(m.matches());
		
		m = p.matcher("121.234.12.12");  
		System.out.println(m.matches());
		
		m = p.matcher("23.45.12.56");  
		System.out.println(m.matches());
		
		m = p.matcher("00.12.123.123123.123");  
		System.out.println(m.matches());
		
		m = p.matcher("122.23");  
		System.out.println(m.matches());
		
		m = p.matcher("Hello.IP");  
		System.out.println(m.matches());
	}
}
