import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SerializableClass implements Serializable {
    private int i = 2;
    private int j = 3;
    transient int k;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    SerializableClass(int i, int j) {
        this.i = i;
        this.j = j;
        k = i*j;
    }

    public static void main(String[] args) throws Exception {
        FileOutputStream fileStream = new FileOutputStream("Serial.txt");
        ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
        objStream.writeObject(new SerializableClass(3, 5));
        objStream.close();

        FileInputStream input = new FileInputStream("Serial.txt");
        ObjectInputStream objInput = new ObjectInputStream(input);
        SerializableClass serializableClass = (SerializableClass) objInput.readObject();
        System.out.println("i: " + serializableClass.getI());
        System.out.println("j: " + serializableClass.getJ());
        System.out.println("k: " + serializableClass.k);
        objInput.close();
    }

}