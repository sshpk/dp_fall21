package pk.cuiatd.dp.factorymethod.creators;

import pk.cuiatd.dp.factorymethod.shapes.Rectangle;
import pk.cuiatd.dp.factorymethod.shapes.Shape;

public class RectangleGeometry extends Geometry{

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
