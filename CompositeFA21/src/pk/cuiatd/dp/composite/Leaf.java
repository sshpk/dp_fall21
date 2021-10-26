package pk.cuiatd.dp.composite;

public class Leaf implements Component{

	@Override
	public String operation() {
		return "Leaf";
	}

	@Override
	public void addChild(Component child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChild(Component child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasChildren() {
		// TODO Auto-generated method stub
		return false;
	}

}
