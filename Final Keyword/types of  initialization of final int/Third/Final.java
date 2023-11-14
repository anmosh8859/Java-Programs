public class Final
{
	public final int x;
	Final()
	{ x=3;}    // Initialization Block
	public static void main(String[] args) 
	{
		Final f=new Final();
		System.out.println(f.x);
	}
}