package evolution.diy;

@FunctionalInterface
public interface TriFunction<T, V, E, R> {
	public R apply(T t, V v, E e);
}
