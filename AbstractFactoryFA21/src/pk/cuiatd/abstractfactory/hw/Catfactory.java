package pk.cuiatd.abstractfactory.hw;

public class Catfactory implements SpecieFactory{

	@Override
	public Mammal createMammal() {
		return new Cat();
	}

	@Override
	public Reptile createReptile() {
		return null;
	}

}
