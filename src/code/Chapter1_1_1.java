package code;


public class Chapter1_1_1 {

	/*
	 * 思路一：暴力移位法
	 */
	public static void leftshiftone(char s[], int n) {
		char t = s[0]; // 保存第一个字符
		for (int i = 1; i < n; i++) {
			s[i - 1] = s[i];

		}
		s[n - 1] = t;
	}

	public static void leftshift(char s[], int n, int m) {
		m%=n;
		while (m-- > 0) {
			leftshiftone(s, n);
		}
	}

	/*
	 * 思路二：三步反转法
	 */
	/**
     * 将字符串翻转
     *
     * @param s       输入串
     * @param from     字符串中的起始索引(包括)
     * @param to       字符串中的终止索引(包括)
     * 
     */
	public static void ReverseChar(char[] s, int from, int to) {
		while (from < to) {
			char temp = s[from];
			s[from++] = s[to];
			s[to--] = temp;
		}
	}

	 /**
     * 问题描述：
     *  给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部，如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串
     *  的尾部，使得原字符串变成字符串“cdefab”。请写一个函数完成此功能，要求对长度为n的字符串操作的时间复杂度为 O(n)，空间
     *  复杂度为 O(1)。
     *
     * 思路：
     *  三步旋转法：(X^TY^T)^T=YX
     *
     * @param s   输入串
     * @param n   输入串的长度
     * @param m     前m个字符移到串的最后
     *
     */
	public static void LeftRotateChar(char[] s, int n, int m) {
		m %= n; // 若要左移动大于n位，那么和%n 是等价的
		ReverseChar(s, 0, m - 1); // 反转[0..m - 1]，套用到上面举的例子中，就是X->X^T，即 abc->cba
		ReverseChar(s, m, n - 1); // 反转[m..n - 1]，例如Y->Y^T，即 def->fed
		ReverseChar(s, 0, n - 1); // 反转[0..n -1]，即如整个反转，(X^TY^T)^T=YX，即cbafed->defabc
	}
	
	
	

	public static void main(String[] args) {
		char[] c = { 'a', 'd', 'c', '1', '2', '3', '4' };
		System.out.println(c);
		// leftshift(c, 7, 3);
		LeftRotateChar(c, 7, 2);
		System.out.println(c);
	}
}
