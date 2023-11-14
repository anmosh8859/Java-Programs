public class Instance
{
 private int a;
 {
  System.out.println("Instance a:"+a);
  a=20;
 }
 public Instance()
 {
  System.out.println("Constructer a:"+a);
 }
 public static void main(String []args)
 {
  new Instance();
  new Instance();
 }
}