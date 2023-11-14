import java.io.*;
class PublicWriter{
    public static void main(String[] args) {
        PrintWriter p=new PrintWriter(System.out,true);
        p.println("This is String");
        int i = -7;
        p.println(i);
        double d = 4.5e-7;
        p.println(d);
    }
}