package org.java;

public class DemoRunnable01 implements Runnable{
	private static int taskCount=0;
	private final int id=taskCount++;
	public DemoRunnable01(){
		System.out.println("线程启动");
		
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("运行"+i+"任务号："+id);
			Thread.yield();
		}
		System.out.println("线程关闭"+"任务号："+id);
	}

}
