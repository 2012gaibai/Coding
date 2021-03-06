package think.code.chapter4.train;

public class E05_BitwiseOperators {
	private static void toBinaryString(int i) {
		char buffer[] = new char[32];
		int bufferPosition = 32;
		do {
			buffer[--bufferPosition] = ((i & 0x01) == 1) ? '1' : '0';
			i >>>= 1;
		} while (i != 0);
		for (int j = bufferPosition; j < 32; j++) {
			System.out.print(buffer[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		System.out.print("i1=");
		toBinaryString(i1);
		System.out.print("i2=");
		toBinaryString(i2);
	}
}
