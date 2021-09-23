package pk.cuiatd.abstractfactory.hw;

public class TyrannoosaurusFactory implements SpecieFactory{

	@Override
	public Mammal createMammal() {
		return null;
	}

	@Override
	public Reptile createReptile() {
		return new Tyrannoosaurus();
	}

}