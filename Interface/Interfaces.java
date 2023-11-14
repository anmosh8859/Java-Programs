interface sum
{
	int sum(int x,int y);
}
class B
{
	public int a;
	public void setData(int x)
	{ a=x; }
}
class A extends B implements sum
{
	public int b;
	public void setData(int y)
	{ b=y; }
	public int sum(int x,int y)
	{
		return x+y;
	}
}
class Implement
{
	public static void main(String[] args) 
	{
		B b=new B();
		A a=new A();
		b.setData(5);
		a.setData(9);
		int Sum=a.sum(a.b,b.a);
		System.out.println("Sum of 5 & 9: "+Sum);
	}
}