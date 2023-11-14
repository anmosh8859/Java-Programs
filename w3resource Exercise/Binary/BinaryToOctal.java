import java.util.Scanner;
class BToOct{
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
        System.out.print("Enter the binary number: ");
        long bin=s.nextLong();
        int oct=0,count1=1;
        while(bin>0){
            int count=0,o=0;
            while(count<3){
                if(bin%10==1)
                    o+=(bin%10)*BinToDec.pow(2,count);
                bin/=10;
                count++;
            }
            oct+=o*count1;
            count1*=10;
        }
        System.out.print("Octal Value: "+oct);
    }
}