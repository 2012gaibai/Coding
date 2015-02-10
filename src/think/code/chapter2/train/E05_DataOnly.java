package think.code.chapter2.train;

//public class E05_DataOnly {
//	int i;
//	double d;
//	boolean b;
//
//	public static void main(String[] args) {
//		E05_DataOnly dataOnly = new E05_DataOnly();
//		dataOnly.i = 47;
//		dataOnly.d = 1.1;
//		dataOnly.b = false;
//		System.out.println("i=" + dataOnly.i + " d=" + dataOnly.d + " b="
//				+ dataOnly.b);
//	}
//}

public class E05_DataOnly {
	public static void main(String[] args) {
		E04_DataOnly dataOnly = new E04_DataOnly();
		dataOnly.b = false;
		dataOnly.d = 1.1;
		dataOnly.i = 48;
		System.out.println("i=" + dataOnly.i + " d=" + dataOnly.d + " b="
				+ dataOnly.b);
	}
}
