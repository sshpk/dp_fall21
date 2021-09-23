package pk.cuiatd.dp.factorymethod.creators;

import pk.cuiatd.dp.factorymethod.shapes.Shape;
import pk.cuiatd.dp.factorymethod.shapes.Square;

public class SquareGeomtery extends Geometry{

	@Override
	public Shape createShape() {
		return new Square();
	}

}
