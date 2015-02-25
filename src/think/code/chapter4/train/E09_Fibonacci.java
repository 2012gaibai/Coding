package think.code.chapter4.train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E09_Fibonacci {
	public static int fib(int n){
		if(n<=2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		System.out.println("请输入：");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(n<=0){
			System.out.println("不符合条件的数字");
		}
		for(int i=1;i<=n;i++){
			System.out.print(fib(i)+" ");
		}
	}
}
