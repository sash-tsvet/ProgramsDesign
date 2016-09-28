/**
 * Created by user17 on 28.09.2016.
 */
public class ShapeUtils {
	public static Shape getMaxShape(Shape shape1, Shape shape2) {
		return (shape1.volume() > shape2.volume())? shape1: shape2;
	}
}