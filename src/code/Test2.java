package code;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args) {
		String [] to={"daxue513@126.com","1078429355@qq.com","21321.sad@qq"};
	}
	
	private static boolean isEmail(String email){
		if("".equals(email)||email==null){
			return false;
		}
		
		Pattern p=Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		Matcher m=p.matcher(email);
		
		return m.matches();
	}
}
