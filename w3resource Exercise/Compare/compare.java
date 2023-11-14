import java.util.Scanner;
class compare{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=s.nextInt();
        System.out.print("Enter Second number: ");
        int num2 =s.nextInt();
        if(num1==num2)
            System.out.println("num1=num2");
        else
            System.out.println("num!=num2");
        if(num1<num2)
            System.out.println("num1<num2");
        else
            System.out.println("num>num2");
    }
}