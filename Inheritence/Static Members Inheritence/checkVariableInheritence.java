package Variable_Inheritence;
class parent
{
	static int a=5;
}
class child extends parent
{
	void show_Value()
	{ System.out.println("a="+a); }
}
public class checkVariableInheritence
{
	public static void main(String[] args) 
	{
		System.out.println(child.a);
	}
}