package method.reference;

public class MethodRef2 {
	public static void main(String[] args)
	{
		Myinterface ref= MethodRef2::sum;
		ref.sum(10,40,30);

	}
	public static void sum(int a, int b,int c)
	{
		System.out.println("sum is:"+(a+b+c));
	}
}