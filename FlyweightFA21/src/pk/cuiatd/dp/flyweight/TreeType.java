package pk.cuiatd.dp.flyweight;

public class TreeType {
	String name;
	String otherTreeData;
	Color color;
	public TreeType(String name, String otherTreeData, Color color) {
		this.name = name;
		this.otherTreeData = otherTreeData;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "TreeType [name=" + name + ", otherTreeData=" + otherTreeData + ", color=" + color + "]";
	}
	public void plant(int x, int y) {
        System.out.println(this.toString()+"is planted at ("+x+","+y+")");
    }
}
