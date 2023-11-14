class Superclass
{
	public void f(int x)
	{
		System.out.println("Superclass");
	}
}
class Inheritclass extends Superclass
{
	public void f(int x)
	{
		System.out.println("Inheritclass");
	}
}
public class Overriding
{
	public static void main(String[] args)
	{
		Inheritclass o=new Inheritclass();
		o.f(25);
	}
}