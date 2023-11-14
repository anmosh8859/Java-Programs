abstract class parent				//parent's object can't be  formed
{
	private String name;
	private int age;
	public void setName(String n)
	{
		name=n;
		System.out.println(name);
	}
	public void setAge(int n)
	{
		age=n;
		System.out.println(age);
	} 
}
class child extends parent
{
 public int a;
}
class abstrac
{
	public static void main(String[] args) 
	{	
		child c=new child();
		c.setAge(36);
		c.setName("Anand");
	}
}