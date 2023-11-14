package Growable;
import java.util.Scanner;
interface IntStack{
    void push(long n);
    long pop();
}
class Stack implements IntStack{
    private long stack[];
    private short tos;
    Stack(){
        stack=new long[1];
        tos=-1;
    }
    public void push(long n){
        if(tos==stack.length-1){
            long temp[]=new long[stack.length*2];
            for(int i=0;i<stack.length;i++)
                temp[i]=stack[i];
            stack=temp;
            stack[++tos]=n;
        }
        else
            stack[++tos]=n;
    }
    public long pop(){
        if(tos<0){
            System.out.println("Stack is Empty...");
            return 0;
        }
        else
            return stack[tos--];
    }
}
public class Growable{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        IntStack I=new Stack();
        short option=1;
        while(option==1||option==2){
            System.out.print("Choose one option\n\n1: Push\n2: Pop\nelse: exit\n\nOption: ");
            option=s.nextShort();
            switch (option){
                case 1:
                    System.out.print("Enter the Element: ");
                    I.push(s.nextLong());
                    break;
                case 2:
                    System.out.println("Your Element: "+I.pop());
                    break;
            }
        }
    }
}