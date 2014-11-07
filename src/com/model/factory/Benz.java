package com.model.factory;

public class Benz implements Car {

	@Override
	public void run() {
		System.out.println("Benz启动！");

	}

	@Override
	public void stop() {
		System.out.println("Benz停车！");

	}

}
