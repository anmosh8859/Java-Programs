import java.util.Scanner;
class add{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the binary numbers: ");
        long a=s.nextLong();
        long b=s.nextLong();
        long sum=0,n=0;
        int temp=1;
        while(a>0||b>0){
            sum+=((a%10+b%10+n)%2)*temp;
            n=((a%10+b%10+n)/2);
            a=a/10;
            b=b/10;
            temp*=10;
        }
        if(n>0)
            sum=sum+temp;
        System.out.println("Sum= "+sum);
    }
}