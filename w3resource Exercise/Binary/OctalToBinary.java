import java.util.Scanner;
class OToB{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the octal value: ");
        int oct=s.nextInt();
        long bin=0,count1=1;
        while(oct>0){
            short dec=0,count=1,binl=0;
            dec=(short)(oct%10);
            oct/=10;
            while(dec>0){
                binl+=dec%2*count;
                count*=10;
                dec/=2;
            }
            bin=binl*count1+bin;
            count1*=1000;
        }
        System.out.print("Binary Value: "+bin);
    }
}