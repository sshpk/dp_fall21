package pk.cuiatd.abstractfactory.hw;

public class SnakeFactory implements SpecieFactory{

	@Override
	public Mammal createMammal() {
		return null;
	}

	@Override
	public Reptile createReptile() {
		return new Snake();
	}

}
