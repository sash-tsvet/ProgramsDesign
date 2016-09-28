/**
 * Created by user17 on 28.09.2016.
 */
public class ShapeUtils {
	public static Shape getMaxShape(Shape cube, Shape sphere) {
		return (cube.volume() > sphere.volume())? cube: sphere;
	}
}