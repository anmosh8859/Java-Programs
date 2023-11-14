import java.util.Scanner;
class BinToDec{
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
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the binary value: ");
        long bin=s.nextLong();
        int dec=0;
        for(int i=0;bin>0;i++){
            if(bin%10==1)
                dec+=(bin%10)*BinToDec.pow(2,i);
            bin/=10;
        }
            System.out.print("Decimal Value: "+dec);
    }
}