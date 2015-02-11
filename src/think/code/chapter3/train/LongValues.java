package think.code.chapter3.train;

public class LongValues {
	public static void main(String[] args) {
		long n1=0xffff;
		long n2=077777;
		System.out.println("n1 :"+Long.toBinaryString(n1));
		System.out.println("n2 :"+Long.toBinaryString(n2));
	}
}
