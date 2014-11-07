package com.model.simplefactory;

public class People {
	public static void main(String[] args) {
		ICar iCar = null;
		try {
			iCar = Factory.createCar("car");
		} catch (Exception e) {
			e.printStackTrace();
		}
		iCar.drive();

	}
}
