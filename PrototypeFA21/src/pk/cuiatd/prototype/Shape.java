package pk.cuiatd.prototype;

public class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}
	public Shape(Shape shape){
		this.color = shape.color;
	}
	public String getColor() {
		return color;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Shape(this);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape))
			return false;
		Shape newShape = (Shape)obj;
		if(color.equals(newShape.getColor()))
			return true;
		else
			return false;
	}
}
