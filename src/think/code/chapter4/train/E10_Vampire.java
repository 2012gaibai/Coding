package think.code.chapter4.train;

import java.util.Arrays;

public class E10_Vampire {
	public static void main(String[] args) {
		String[] ar_str1, ar_str2;
		int sum = 0;
		int from;
		int to;
		int i_val;
		int count = 0;
		for (int i = 10; i < 100; i++) {
			from = Math.max(1000 / i, i + 1);//两个数的积不能小于1000且不小于i
			to = Math.min(10000 / i, 100);//两个数的积不能大于10000且不大于100
			for (int j = from; j < to; j++) {
				i_val = i * j;
				//以两个0结尾的数是不允许的且i_val-i-j是9的倍数(可证明)
				if ((i_val % 100 == 0) || ((i_val - i - j) % 9 != 0)) {
					continue;
				}
				count++;
				ar_str1 = String.valueOf(i_val).split("");
				ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
				Arrays.sort(ar_str1);
				Arrays.sort(ar_str2);
				if (Arrays.equals(ar_str1, ar_str2)) {
					sum++;
					System.out.println("第" + sum + "组:" + i + "*" + j + "="
							+ i_val);
				}
			}
		}
		System.out.println("共"+sum+"组吸血鬼数");
		System.out.println(count);
	}
}
