package think.code.chapter21.code;

public class MainThread {
	public static void main(String[] args) {
		//LiftOff liftOff = new LiftOff();
		//liftOff.run();
		for(int i=0;i<5;i++){
			new LiftOff().run();
		}
		System.out.println("waiting for liftOff");
	}
}
