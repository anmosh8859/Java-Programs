class Superclass
{
	public final void f(int x)
	{
		System.out.println("Superclass");
	}
}
class Inheritclass extends Superclass
{
	public void f(int x)                         //error
	{
		System.out.println("Inheritclass");
	}
}
public class Final
{
	public static void main(String[] args)
	{
		Inheritclass o=new Inheritclass();
		o.f(25);
	}
}