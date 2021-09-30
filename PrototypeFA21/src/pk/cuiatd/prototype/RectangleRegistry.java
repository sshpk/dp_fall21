package pk.cuiatd.prototype;

import java.util.HashMap;

public class RectangleRegistry {
	HashMap <String, Rectangle> cache = new HashMap<String, Rectangle>();
	Rectangle getRectangle(String color){
		Rectangle rectangle = cache.get(color);
		if(rectangle==null){
			rectangle = new Rectangle(color, 1, 1);
			cache.put(color, rectangle);
			return rectangle;
		}
		else
			return rectangle.clone();
		
	}
}
