package code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args) {
		double num = 0;
		for (int i = 1; i < 6; i++) {
			num +=(double) 1 / i;
		}
		num=num*1000000;
		System.out.println(num);
		int out = (int) num;
		
		System.out.println(out);
	}

	private static boolean isEmail(String email) {
		if ("".equals(email) || email == null) {
			return false;
		}

		Pattern p = Pattern
				.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		Matcher m = p.matcher(email);

		return m.matches();
	}
}
