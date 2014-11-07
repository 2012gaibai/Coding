package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DlcIssue {
	public static String getIssue(String format,String begin,String end) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		Date beginDate=null;
		Date nowDate=null;
		String str=null;
		try {
			beginDate=dateFormat.parse(begin);
			nowDate=dateFormat.parse(end);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long min=(nowDate.getTime()-beginDate.getTime())/(60*1000*10)+1;
		if(min<=9){
			str="0"+min;
		}else if(min>9&&min<=78){
			str=min+"";
		}
		return str;
	}

	public static void main(String[] args) {
		//String now=Utils.today("HHmm");
		System.out.println(getIssue("HHmm", "0859", "1059"));
	}
}
