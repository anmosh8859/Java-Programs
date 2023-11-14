
import java.util.Scanner;
class multiply{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long a=s.nextLong();
        System.out.print("Enter the another number: ");
        long b=s.nextLong(),res=0,count=1;
        while(b>0){
            long n=1,rem=0,temp=res,count2=1,sum=0;
            n=a*(b%10)*count;
            if(n!=0){
                while(n>0||temp>0){
                    sum+=((n%10+temp%10+rem)%2)*count2;
                    rem=(n%10+temp%10+rem)/2;
                    temp/=10;
                    n/=10;
                    count2*=10;
                }
                if(rem>0)
                    sum+=count2;
                res=sum;
            }
            b/=10;
            count*=10;
        }
        System.out.print("Product: "+res);
    }
}