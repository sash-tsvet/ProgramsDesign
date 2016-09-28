import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user17 on 28.09.2016.
 */
public class ShapeUtilsTest {
	@Test
	public void  testMaxVolumeSphere() {
		Cube cube = new Cube(2);
		Sphere sphere = new Sphere(5);
		assertEquals(sphere, ShapeUtils.getMaxShape(cube, sphere));
		assertEquals(sphere, ShapeUtils.getMaxShape(sphere, cube));
	}

	@Test
	public void  testMaxVolumeCube() {
		Cube cube = new Cube(5);
		Sphere sphere = new Sphere(3);
		assertEquals(cube, ShapeUtils.getMaxShape(cube, sphere));
		assertEquals(cube, ShapeUtils.getMaxShape(sphere, cube));
	}
}