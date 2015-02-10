package think.code.chapter2.train;
//自己做的
//public class E01_Class {
//	static int i;
//	static char c;
//	public static void main(String[] args) {
//		
//		System.out.println("int类型："+i);
//		System.out.println("char类型：["+c+"]");
//	}
//}
public class E01_Class{
	int i;
	char c;
	public E01_Class(){
		System.out.println("int类型："+i);
		System.out.println("char类型：["+c+"]");	
	}
	public static void main(String[] args) {
		new E01_Class();
	}
}
