package pk.cuiatd.abstractfactory.hw;

public class Demo {

	public static void main(String[] args) {
		SpecieFactory factory1;
		SpecieFactory factory2;
		Mammal mammal;
		Reptile reptile;
		//configure the factory 
		factory1 = new Catfactory();
		factory2 = new SnakeFactory();
		
		mammal = factory1.createMammal();
		reptile = factory2.createReptile();
		
		mammal.makeSound();
		reptile.makeSound();

	}

}
