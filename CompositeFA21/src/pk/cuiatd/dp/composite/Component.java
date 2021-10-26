package pk.cuiatd.dp.composite;

public interface Component {
	String operation();
	void addChild(Component child);
	void removeChild(Component child);
	boolean hasChildren();
}
