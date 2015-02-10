package code;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		int sum=0;
		for (int i = 0; i < 2000; i++) {
			if (random.nextInt() % 2 == 0) {
				System.out.println("正面");
				sum++;
			} else {
				System.out.println("反面");
			}
		}
		System.out.println(sum);
	}
}
