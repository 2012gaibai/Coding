package think.code.chapter3.train;

public class RightShiftTest {
	public static void main(String[] args) {
		int i=0x80000000;
		System.out.println(Integer.toBinaryString(i));
		i>>=1;
		System.out.println(Integer.toBinaryString(i));
		i>>=1;
		System.out.println(Integer.toBinaryString(i));
		i=-123;
		System.out.println(Integer.toBinaryString(i));
		i>>=1;
		System.out.println(Integer.toBinaryString(i));
		i=123;
		System.out.println(Integer.toBinaryString(i));
		i>>=2;
		System.out.println(Integer.toBinaryString(i));
		i=-123;
		System.out.println(Integer.toBinaryString(i));
		i>>>=2;
		System.out.println(Integer.toBinaryString(i));
		i=0x80000000;
		System.out.println(Integer.toBinaryString(i));
		i<<=1;
		System.out.println(Integer.toBinaryString(i));
	}
}
