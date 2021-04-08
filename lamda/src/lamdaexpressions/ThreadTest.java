package lamdaexpressions;

public class ThreadTest {
	public static void main(String[] args)
	{
		MyRunnable r =new MyRunnable();
		Thread t =new Thread(r);
		t.start();
	}

}
