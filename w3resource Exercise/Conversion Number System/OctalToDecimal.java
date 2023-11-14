import java.util.Scanner;
class OToD{
    static int pow(int num,int power){
        int n=num;
        if(power==0)
            return 1;
        else if(power==1)
            return num;
        for(int i=2;i<=power;i++)
            num*=n;
        return num;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Octal Value: ");
        Scanner s=new Scanner(System.in);
        long oct=s.nextLong(),dec=0;
        int count=0;
        while(oct>0){
            dec+=oct%10*pow(8,count);
            count++;
            oct/=10;
        }
        System.out.print("Decimal Value: "+dec);
    }
}