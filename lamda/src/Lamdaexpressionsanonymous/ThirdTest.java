package Lamdaexpressionsanonymous;

public class ThirdTest {
	public static void main(String[] args)
	{
		Interfacez interfacez = new Interfacez()
				{
			public void m2()
			{
				System.out.println("m2-- interfacez");
			}
			public void m1()
			{
				System.out.println("m1--interfacez");
			}
			
				};
				interfacez.m1();
				interfacez.m2();
	}

}
