import java.util.Scanner;
class DToHex{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        long dec=s.nextLong();
        String hex="";
        char index[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(dec>0){
            hex=index[(int)dec%16]+hex;
            dec/=16;
        }
        System.out.print("Hexadecimal Value: "+hex);
    }
}