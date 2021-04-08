package inheritance;

public class TestDefaultInheritance implements Left, Right{
	public void m1() {
		Left.super.m1();
	}
	public void m2() {
		Right.super.m2();
	}	

public static void main(String[] args)
{
	TestDefaultInheritance tdi = new TestDefaultInheritance();
	tdi.m1();
	tdi.m2();
	
}
}


