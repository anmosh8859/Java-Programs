package Full;
class parent
{
	static int a=5;
	static void set_Value()
	{
		a=16;
	}
	void show_Value()
	{ System.out.println("a="+a);}
}
class child extends parent
{
	static int a=6;
	static void set_Value()
	{
		a=9;
	}
	void show_Value()
	{ System.out.println("a="+a); }
}
public class Main
{
	public static void main(String[] args) 
	{
		child c=new child();
		c.show_Value();
	}
}