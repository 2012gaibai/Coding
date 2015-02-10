package think.code.chapter3.code;

class Tank{
	int level;
}

public class Assignment {
	public static void main(String[] args) {
		Tank t1=new Tank();
		Tank t2=new Tank();
		t1.level=27;
		t2.level=39;
		System.out.println("t1.level="+t1.level+" t2.level"+t2.level);
		
		t1=t2;
		System.out.println("t1.level="+t1.level+" t2.level"+t2.level);
		
		t1.level=49;
		System.out.println("t1.level="+t1.level+" t2.level"+t2.level);
	}
}
