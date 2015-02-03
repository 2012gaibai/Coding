package org.java;

public class DemoThread01 {
	public static void main(String[] args) {
		for (int j = 0; j < 100; j++) {
			new Thread(new DemoRunnable01()).start();
		}

	}
}
