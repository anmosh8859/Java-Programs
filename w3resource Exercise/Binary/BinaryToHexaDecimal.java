import java.util.Scanner;
class BToHex{
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
        char hexa[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String hex="";
        while(bin>0){
            int count=0,dec=0;
            while(count<4){
                if(bin%10==1)
                    dec+=(bin%10)*BinToDec.pow(2,count);
                bin/=10;
                count++;
            }
            hex=hexa[dec]+hex;
        }
        System.out.print("Hexadecimal Value: "+hex);
    }
}