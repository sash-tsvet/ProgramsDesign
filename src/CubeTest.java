import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user17 on 28.09.2016.
 */
public class CubeTest {
	Cube testCube = new Cube(10);
	@Test
	public void volume() {
		assertEquals(1000.0, testCube.volume(), 0.0001);
	}

}