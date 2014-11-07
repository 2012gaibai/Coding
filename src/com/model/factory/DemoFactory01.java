package com.model.factory;

public class DemoFactory01 {
	public static void main(String[] args) {
		Car car = Factory01.getCarInstance("Ford");
		if (car != null) {
			car.run();
			car.stop();
		} else {
			System.out.println("无此类型的车！");
		}
	}
}
