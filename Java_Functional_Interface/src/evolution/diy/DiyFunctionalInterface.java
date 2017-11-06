package evolution.diy;

import org.junit.Test;

public class DiyFunctionalInterface {
	@Test
	public void test() {
		TriFunction<Double, Double, Double, Double> tf = (x, y, z) -> x + y + z;
		double result = tf.apply(3d, 4d, 5d);
		System.out.println(result);
	}
}
