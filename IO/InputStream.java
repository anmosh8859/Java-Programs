import java.io.*;

class br{
    public static void main(String[] args)throws IOException {
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do{
            c=(char)br.read();
            System.out.println(c);
        }while(c!='q');
        String str;
        do{
            str=br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }
}