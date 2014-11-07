package code;

/**
 * @author ganqi
 * @since 2014/10/27 10:13
 * @see 求子数组的最大和 题目： 输入一个整形数组，数组里有正数也有负数。 数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 *         求所有子数组的和的最大值。要求时间复杂度为O(n)。
 * 
 * 
 */

public class MaxSum {
	public static void main(String[] args) {
		int[] array = { 1, -8, 6, 3, -1, 5, 7, -2, 0, 1 };
		int sum = maxSum(array);
		System.out.println(sum);
	}

	public static int maxSum(int array[]) {
		int len = array.length;
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			if (temp <= 0) {
				temp = array[i];
			} else {
				temp += array[i];
			}

			if (sum < temp) {
				sum = temp;
			}
		}
		return sum;
	}
}
