package think.code.chapter21.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService =Executors.newSingleThreadExecutor();
		for(int i=0;i<10000;i++){
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();
	}
}
