class Superclass
{
	public void f(int x,int y)
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
public class Overloading
{
	public static void main(String[] args)
	{
		Inheritclass o=new Inheritclass();
		o.f(25);
		o.f(25,36);
	}
}