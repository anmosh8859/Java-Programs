class SuperClass
{
	int x;
	public void fun()
	{
		System.out.println("SuperClass");
	}
}
class Subclass extends SuperClass
{
	private int x;
	public void fun()
	{
		System.out.println("SubClass Showing SuperClass");
		super.fun();
	}
	public void Set_Values(int x,int y,int z)
	{
		System.out.println("Set_Values's = "+x);
		super.x=y;
		this.x=z;
	}
	public void Show_values()
	{
		System.out.println("SubClass's Valueof x= "+this.x);
		System.out.println("SuperClass's Valueof x= "+super.x);
	}
}
public class main
{
	private int x;
	public static void main(String[] args)
	{
		Subclass sb=new Subclass();
		sb.Set_Values(3,4,5);
		sb.Show_values();
	}
}