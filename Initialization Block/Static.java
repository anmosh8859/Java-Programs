public class Static
{
 private static int a;
 static
 {
  System.out.println("Static a:"+a);
  a=20;
 }
 public Static()
 {
  System.out.println("Constructer a:"+a);
 }
 public static void main(String []args)
 {
  new Static();
  new Static();
 }
}