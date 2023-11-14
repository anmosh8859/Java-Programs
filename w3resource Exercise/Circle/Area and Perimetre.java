import java.util.Scanner;
class AAndP{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        float r=s.nextFloat();
        System.out.print("Area of Circle: "+Math.PI*r*r+"Perimetre of Cirle: "+2*Math.PI*r+"\n"+Math.PI);
    }
}