package code;

public class Test1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		int i=8;
		while (true) {
			i++;
			sb.append(i);
			if(i>10){
				break;
			}
			sb=new StringBuffer();
			
		}
		System.out.println(sb.toString());
	}
	
}
