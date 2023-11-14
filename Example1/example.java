class Box
{
	private int length,breadth,height;
	public void setdimension(int l,int b,int h)
	{
		length=l;breadth=b;height=h;
	}
	public void showdimension()
	{
	System.out.println("l="+length);
	System.out.println("b="+breadth);
	System.out.println("h="+height);
	}
}
public class example
{
	public static void main(String[] args)
	{
		Box SmallBox=new Box();
		SmallBox.setdimension(12,5,11);
		SmallBox.showdimension();
		SmallBox=new Box();
		SmallBox.showdimension();
		}
}