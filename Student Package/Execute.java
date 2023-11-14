package Execute;
import Main.Student;
public class Execute
{
	public static void main(String[] args) 
	{
		Student Object=new Student();
		Object.setRollNo(100);
		Object.setName("The Anand M Sharma");
		System.out.println("Roll No.= "+Object.getRollNo());
		System.out.println("Name= "+Object.getName());
	}
}