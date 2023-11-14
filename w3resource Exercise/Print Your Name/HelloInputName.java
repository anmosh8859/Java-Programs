import java.util.Scanner;
class Input{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String fname=s.next();
        System.out.print("Enter Your Last Name: ");
        String lname=s.next();
        System.out.println("Hello!\n"+fname+" "+lname);
    }
}