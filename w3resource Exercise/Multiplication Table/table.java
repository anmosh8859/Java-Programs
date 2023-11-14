import java.util.Scanner;
class table{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=s.nextInt();
        for(int i=1;i!=10;i++)
            System.out.println(a+" * "+i+": "+a*i);
    }
}