package org.java;

class DataOnly1 {
	int i;
	double d;
	boolean b;
}

public class DataOnly {
	public static void main(String[] args) {
		DataOnly1 data = new DataOnly1();
		data.i = 1;
		data.d = 1.1;
		data.b = true;
		System.out.println(data.toString());
	}
}
