package com.model.factory;

public class Factory01 {

	public static Car getCarInstance(String type) {
		Car car = null;

		try {
			// 利用反射得到汽车类型
			car = (Car) Class.forName("com.model.factory." + type)
					.newInstance();
		} catch (Exception e) {

			System.out.println("无此车型" + e.getMessage());
		}

		return car;
	}
}
