package think.code.chapter21.code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff {

	public void run() {
		try {
			while (countDown-- > 0) {
				System.out.print(status());

				TimeUnit.MILLISECONDS.sleep(100);

			}
		} catch (InterruptedException e) {

			System.err.println("interrupted");
		}

	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			executorService.execute(new SleepingTask());

		executorService.shutdown();
	}
}