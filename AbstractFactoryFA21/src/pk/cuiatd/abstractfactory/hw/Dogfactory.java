package pk.cuiatd.abstractfactory.hw;

public class Dogfactory implements SpecieFactory{

	@Override
	public Mammal createMammal() {
		return new Dog();
	}

	@Override
	public Reptile createReptile() {
		return null;
	}

}
