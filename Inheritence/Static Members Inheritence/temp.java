package Function_Inheritence;
class parent
{
	static int a=5;
	static
	{
		a=3;
	}
	static void show_Value()
	{
		System.out.println("Parent Static");
	}
}
class child extends parent
{
	static void show_Value()
	{
		System.out.println("Child Static");
	}
	/*-------->As It gives run time error
	void show_Value()
	{ System.out.println("a="+a); }
	*/
}
public class temp
{
	public static void main(String[] args) 
	{
		child.show_Value();
		System.out.println(child.a);
		/*
		child c=new child();
		c.show_Value();
		*/
	}
}