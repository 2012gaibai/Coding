package think.code.chapter3.train;

class Letter {
	double d;
}

public class PassObject2 {
	static void f(Letter letter) {
		letter.d = 1.2;
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.d = 2.3;
		System.out.println("1. x.d=" + x.d);

		f(x);
		System.out.println("2. x.d=" + x.d);

	}
}
