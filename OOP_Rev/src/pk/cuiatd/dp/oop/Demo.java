package pk.cuiatd.dp.oop;

public class Demo {

	public static void main(String[] args) {
		Animal[] animals = new Animal[6];
		animals[0] = new Fox();
		animals[1] = new Fox();
		animals[2] = new Bird();
		animals[3] = new Frog();
		animals[4] = new Bird();
		animals[5] = new Dog();
		move(animals);
		
		Animal dog = new Dog();
		

	}

	private static void move(Animal[] animals) {
		for(Animal a:animals){
			a.move();
		}
		
	}

}
