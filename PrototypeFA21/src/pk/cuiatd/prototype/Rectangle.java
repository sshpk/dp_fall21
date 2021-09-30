package pk.cuiatd.prototype;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{
	int width, height;

	public Rectangle(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Rectangle rectangle){
		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	@Override
	protected Rectangle clone() {
		return new Rectangle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle)|| !super.equals(obj))
			return false;
		Rectangle rectangle2=(Rectangle)obj;
		return ((rectangle2.getWidth()==this.width)&&(rectangle2.getHeight()==this.height));

	}

	public int getWidth() {
		return this.width;
	}
	public int getHeight(){
		return this.height;
	}
}