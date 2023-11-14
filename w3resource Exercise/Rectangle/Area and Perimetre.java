import java.util.Scanner;
class AAndP{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length: ");
        float l=s.nextFloat();
        System.out.print("Enter the width: ");
        float b=s.nextFloat();
        System.out.print("Area: "+2*(l+b)+"Perimetre: "+l*b);
    }
}