import java.util.Scanner;
class Average{
    public static void main(String[] args) {
        System.out.print("Enter any three numbers: ");
        Scanner s=new Scanner(System.in);
        System.out.print((s.nextInt()+s.nextInt()+s.nextInt())/3+" is the average of above numbers.");
    }
}