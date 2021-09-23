package pk.cuiatd.dp.factorymethod;
import java.util.ArrayList;
import java.util.List;

import pk.cuiatd.dp.factorymethod.creators.CircleGeometry;
import pk.cuiatd.dp.factorymethod.creators.RectangleGeometry;
import pk.cuiatd.dp.factorymethod.creators.SquareGeomtery;
import pk.cuiatd.dp.factorymethod.shapes.Shape;

public class Demo {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		
		CircleGeometry circleGeometry = new CircleGeometry();
		SquareGeomtery squareGeomtery = new SquareGeomtery();
		RectangleGeometry rectangleGeometry = new RectangleGeometry();
		
		shapes.add(circleGeometry.createShape());
		shapes.add(rectangleGeometry.createShape());
		shapes.add(rectangleGeometry.createShape());
		shapes.add(squareGeomtery.createShape());
		
		for(Shape shape:shapes){
			shape.draw();
		}

	}

}
