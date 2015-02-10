package think.code.chapter3.train;

class Dog{
	String name;
	String says;
	public void setName(String name) {
		this.name = name;
	}
	public void setSays(String says) {
		this.says = says;
	}
	
	public void showName(){
		System.out.println(name);
	}
	
	public void speak(){
		System.out.println(says);
	}
}

public class DogCompare {
	public static void main(String[] args) {
		Dog spot=new Dog();
		Dog butch=new Dog();
		spot.setName("spot");
		spot.setSays("Ruff");
		
		spot.showName();
		spot.speak();
		
		butch.setName("butch");
		butch.setSays("Hello");
		butch.showName();
		butch.speak();
		
		System.out.println("spot==butch :"+(spot==butch));
		System.out.println("spot.equals(butch) :"+spot.equals(butch));
		
		spot=butch;
		System.out.println("spot==butch :"+(spot==butch));
		System.out.println("spot.equals(butch) :"+spot.equals(butch));
		
		spot.showName();
		spot.speak();
		
		butch.showName();
		butch.speak();
		
	}
}
