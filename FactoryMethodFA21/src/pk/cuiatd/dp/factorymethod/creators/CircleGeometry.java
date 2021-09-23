package pk.cuiatd.dp.factorymethod.creators;

import pk.cuiatd.dp.factorymethod.shapes.Circle;
import pk.cuiatd.dp.factorymethod.shapes.Shape;

public class CircleGeometry extends Geometry{

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
