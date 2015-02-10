package think.code.chapter2.train;

class StaticTest {
	static int i = 47;
}

public class E07_Incrementable {
	public static void increment() {
		StaticTest.i++;
	}
	public static void main(String[] args) {
		increment();
		E07_Incrementable incrementable=new E07_Incrementable();
		incrementable.increment();
		E07_Incrementable.increment();
	}
}
