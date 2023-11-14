import java.util.Scanner;
class HToO{
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
        long dec=htod(s.nextLine()),bin=0,count=1;;
        while(dec>0){
            bin+=(dec%8)*count;
            count*=10;
            dec/=8;
        }
        System.out.print("Binary number: "+bin);
    }
}