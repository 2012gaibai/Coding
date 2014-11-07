package com.model.simplefactory;

public class Factory {


	public static ICar createCar(String str) throws Exception{
		ICar icar = null;
		switch (str) {
		case "car":
			icar = new Car();
			break;
		case "train":
			icar = new Train();
			break;
		default:
			throw new Exception("坏车");
			
		}
		return icar;

	}
}
