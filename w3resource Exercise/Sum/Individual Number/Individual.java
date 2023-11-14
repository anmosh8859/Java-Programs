import java.util.Scanner;
class Individual{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=s.nextInt(),sum=0;
        while(x>0){
            int r=x%10;
            sum+=r;
            x/=10;
        }
        System.out.println("Sum of their individual Dgits: "+sum);
    }
}