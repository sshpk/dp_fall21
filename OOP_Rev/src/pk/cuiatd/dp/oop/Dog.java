package pk.cuiatd.dp.oop;

public class Dog implements Animal{

	@Override
	public void move() {
		System.out.println("I am a dog, I am running");
	}
	
	public void makeSound(){
		System.out.println("Woof!");
	}

}
