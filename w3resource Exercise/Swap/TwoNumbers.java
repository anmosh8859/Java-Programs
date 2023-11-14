import java.util.Scanner;
class swap{
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Before Swap: a= "+a+" b= "+b);
        int c=b;
        b=a;
        a=c;
        System.out.println("After Swap: a= "+a+" b= "+b);
    }
}