package inheritance;

public interface Right {

	public default void m2()
	{
		System.out.println("right interface");
	}
}
