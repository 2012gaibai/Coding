package think.code.chapter2.train;

public class E08_StaticTest {
	static int i=47;
	public static void main(String[] args) {
		E08_StaticTest staticTest01=new E08_StaticTest();
		E08_StaticTest staticTest02=new E08_StaticTest();
		
		System.out.println(staticTest01.i+"=="+staticTest02.i);
		
		staticTest01.i++;
		System.out.println(staticTest01.i+"=="+staticTest02.i);
	}
}
