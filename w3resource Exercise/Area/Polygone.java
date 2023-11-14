import java.util.Scanner;
class Polygone{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of a side of Polygone: ");
        int side=s.nextInt();
        System.out.print("Enter the number of Polygon's sides: ");
        int num=s.nextInt();
        System.out.println("Area of Polygone: "+(num*(side*side))/(4*Math.tan(Math.PI/num)));
    }
}