package think.code.chapter21.code;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		if (id == 5) {
			Thread.sleep(3000);
		}
		return "task of result" + id;
	}

}

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			results.add(executorService.submit(new TaskWithResult(i)));
		}

		for (Future<String> future : results) 
			try {
				System.out.println(future.get(1000, TimeUnit.MILLISECONDS));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (ExecutionException e) {
				
				e.printStackTrace();
			} catch (TimeoutException e) {
				
				e.printStackTrace();
			} finally {
				executorService.shutdown();
			}

		
	}
}
