package method.reference.method;

public class PlayConstructorReference {
	public static void main(String[] args)
	{
		Isample isample = sample::new;
		sample s1 =isample.get("himani");
	}

}
