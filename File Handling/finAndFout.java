import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile{
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fin=new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            return;
        }
        try {
            fout=new FileOutputStream(args[1]);
        } catch (FileNotFoundException e) {
            System.out.println("File can't be open!");
            return;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Usage: ShowFile File from to");
            return;
        }
        try{
            do{
               i=fin.read();
               if(i!=-1){
                System.out.print((char)i);
                fout.write(i);
                }
            }while(i!=-1);
        }catch(IOException e){
            System.out.println("File Error!");
        }
        fin.close();
        fout.close();
    }
}