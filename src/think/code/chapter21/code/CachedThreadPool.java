package think.code.chapter21.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exc=Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			exc.execute(new LiftOff());
		exc.shutdown();
	}
}
