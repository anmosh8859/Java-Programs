class parent
{
	int a;
	public parent(int x)
	{
		a=x;
		System.out.println("Parent int a="+a);
	}
}
class child extends parent
{
	int b;
	public child(int x)
	{
		super(x);				//to constructer having arguement in parent class
		b=x;
		System.out.println("Child int="+b);
	}
}
public class constructorInheritence
{
	public static void main(String[] args)
	{
		new child(5);
	}
}