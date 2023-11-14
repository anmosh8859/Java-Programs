import java.util.Scanner;
class HToD{
    public static long htod(String s){
        String hex="0123456789ABCDEF";
        long val=0;
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
            val=16*val+hex.indexOf(s.charAt(i));
        return val;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the hexadecimal value: ");
        long dec=htod(s.nextLine());
        System.out.print("Decimal Value: "+dec);
    }
}