package think.code.chapter3.code;

class Letter {
	char c;
}

public class PassObject {
	public static void f(Letter letter) {
		letter.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1. x.c=" + x.c);

		f(x);
		System.out.println("2. x.c=" + x.c);
	}
}
