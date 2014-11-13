package code;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("haha", "1213");
		map.put("haha", "5443");
		System.out.println(map.get("haha"));
		
	}
}
