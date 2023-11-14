import java.util.Scanner;
class OToH{
    public static void main(String[] args) {
        System.out.print("Enter the octal value: ");
        Scanner s=new Scanner(System.in);
        String oct=s.nextLine();
        System.out.print("Hexadecimal Value: "+Integer.toHexString(Integer.parseInt(oct,8)));
    }
} 