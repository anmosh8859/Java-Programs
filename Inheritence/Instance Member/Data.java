public class Data
{
	public static void main(String[] args) 
	{
		maleorfemale h=new maleorfemale();
		h.setage(25);
		h.setqualification("Polytechnic");
		h.setgender("Male");
		System.out.println("Age: "+h.getage());
		System.out.println("Qualification: "+h.getqualification());
		System.out.println("Gender: "+h.getgender());
	}
}