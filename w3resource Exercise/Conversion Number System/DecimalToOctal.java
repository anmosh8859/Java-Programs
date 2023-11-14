import java.util.Scanner;
class DToO{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        long dec=s.nextLong(),oct=0;
        int count=1;
        while(dec>0){
            oct+=dec%8*(int)count;
            dec/=8;
            count*=10;
        }
        System.out.print("Octal Value: "+oct);
    }
}