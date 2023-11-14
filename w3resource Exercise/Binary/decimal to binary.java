import java.util.Scanner;
class DToB{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        long dec=s.nextLong(),bin=0,count=1;
        while(dec>0){
            bin+=(dec%2)*count;
            count*=10;
            dec/=2;
        }
        System.out.print("Binary number: "+bin);
    }
}