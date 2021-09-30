package pk.cuiatd.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*Rectangle rectangle = new Rectangle("Red", 6, 8);
		Rectangle rectangle2 = rectangle.clone();
		
		if(rectangle.equals(rectangle2)){
			System.out.println("both the rectangles are equal");
		}
		else
			System.out.println("not equal");*/
		
		RectangleRegistry registry = new RectangleRegistry();
		Rectangle rectangle = registry.getRectangle("red");
		Rectangle rectangle2 = registry.getRectangle("red");
		
		if(rectangle.equals(rectangle2)){
			System.out.println("both the rectangles are equal");
		}
		else
			System.out.println("not equal");

	}

}
