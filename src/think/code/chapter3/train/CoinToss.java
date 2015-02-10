package think.code.chapter3.train;

import java.util.Random;

public class CoinToss {
	public static void main(String[] args) {
		Random rand = new Random();

		if (rand.nextInt(2) == 0) {
			System.out.println("正面");
		} else {
			System.out.println("反面");
		}
	}

}
