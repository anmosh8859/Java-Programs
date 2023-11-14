import java.util.Scanner;
class Stack{
    private int arr[];
    private int tos;
    Stack(int n){
        arr= new int[n];
        tos=-1;
    }
    protected void push(int n){
        if(tos==arr.length-1)
        {
            System.out.println("Stack is full");
        }
        else
            arr[++tos]=n;
    }
    protected int pop(){
        if(tos==-1){
            System.out.println("Stack is Empty");
            return 0;
        }
        else
            return arr[tos--];
    }
}
class TestStack{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int element,capacity,option=1;
        System.out.println("Enter the capacity of stack");
        capacity=s.nextInt();
        Stack stack=new Stack(capacity);
        while(option==1||option==2)
        {
            System.out.println("Choose one option\n");
            System.out.print("1: Push\n2: Pop\n\nOption: ");
            option=s.nextInt();
            switch(option)
            {
                case 1:
                    System.out.print("Enter the Element");
                    element=s.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    element=stack.pop();
                        System.out.println("Element in stack: "+element);
                    break;
            }
		}
    }
}