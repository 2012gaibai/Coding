package think.code.chapter21.train;

class Printer implements Runnable{

	private static int taskCount=0;
	private final int id=taskCount++;
	
	Printer(){
		System.out.println("线程"+id+"开始");
	}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("线程"+id+"次数:"+(i+1));
			Thread.yield();
		}
		System.out.println("线程"+id+"关闭");
	}
	
}

public class E01_Runnable {
public static void main(String[] args) {
	for(int i=0;i<10;i++){
		new Thread(new Printer()).start();
	}
}
}
