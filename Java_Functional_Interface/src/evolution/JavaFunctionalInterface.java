package evolution;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.junit.jupiter.api.Test;

public class JavaFunctionalInterface {
	@Test
	public void test() {
		Function<String, String> function = x -> x + 1;
		BiFunction<String, String, String> biFunction = (x, y) -> x + y;
		Predicate<String> predicate = x -> x.length() > 0;
		Consumer<String> consumer = x -> System.out.println(x);
		Supplier<String> supplier = () -> "Hello World";
		Comparator<Integer> comparator = (x, y) -> Integer.compare(y, x);
		BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;// An simplified version of BiFunction
		Integer result = binaryOperator.apply(4, 5);// The result is 9.
		UnaryOperator<Integer> unaryOperator = x -> x * -1;
		unaryOperator.apply(3);// The result is -3.
	}
}
