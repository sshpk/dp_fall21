package pk.cuiatd.dp.flyweight;

public class Tree {
	private int x;
	private int y;
	private TreeType type;

	public Tree(int x, int y, TreeType type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public void plant() {
		type.plant(x, y);
	}
}
