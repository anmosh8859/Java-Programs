class NewThread implements Runnable{
    String Name="";
    Thread t;
    NewThread(String Name){
        this.Name=Name;
        t=new Thread(this,Name);
        System.out.println("New Thread: "+t);
        t.start();
    }
    public void run(){
        try {
           for(int i=0;i<5;i++){
               System.out.println(Name+" : "+i);
               Thread.sleep(500);
           } 
        } catch (InterruptedException e) {
            System.out.println(Name+"Thread Interrupted");
        }
        System.out.println(Name+"Thread Exited");
    }
}
public class Multithread{
    public static void main(String[] args) {
        NewThread t1=new NewThread("First");
        NewThread t2=new NewThread("Second");
        NewThread t3=new NewThread("Third");
        System.out.println("First is alive: "+t1.t.isAlive());
        System.out.println("First is alive: "+t2.t.isAlive());
        System.out.println("First is alive: "+t3.t.isAlive());
        System.out.println("Waiting for threads to finish...");
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("First is alive: "+t1.t.isAlive());
        System.out.println("First is alive: "+t2.t.isAlive());
        System.out.println("First is alive: "+t3.t.isAlive());
        System.out.println("Main Thread Exited");
    }
}