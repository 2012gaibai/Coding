package think.code.chapter4.train;

public class E04_FindPrimes {
	public static void main(String[] args) {
		int max = 100;
		for (int i = 1; i <= max; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				System.out.print(i + " ");
			}
		}
	}
}
