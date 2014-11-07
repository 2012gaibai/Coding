package com.model.factory;

public class Ford implements Car {

	@Override
	public void run() {
		System.out.println("ford启动");

	}

	@Override
	public void stop() {
		System.out.println("ford停车");

	}

}
