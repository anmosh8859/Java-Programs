class NewThread extends Thread{
    NewThread(){
        super("New Thread");
        System.out.println("Child Thread: "+this);
        start();
    }
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println("NewThread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("NewThread Interrupted");
        }
        System.out.println("New Thread Exited");
    }
}
public class ExtendsThread{
    public static void main(String[] args) {
        new NewThread();
        try {
            for(int i=0;i<5;i++){
                System.out.println("MainThread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}