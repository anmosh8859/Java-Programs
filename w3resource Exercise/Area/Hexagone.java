import java.util.Scanner;
class Hexagone{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of a side of hexagone: ");
        int side=s.nextInt();
        System.out.println("Area of Hexagone: "+(6*(side*side))/(4*Math.tan(Math.PI/6)));
    }
}