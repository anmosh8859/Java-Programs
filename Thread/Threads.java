class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"New Thread");
        System.out.println("Child Thread: "+t);
        t.start();
    }
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println("New Thread"+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("New Thread Interrupted");
        }
        System.out.println("Exiting New Thread");
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();
        try {
            for(int i=0;i<5;i++){
                System.out.println("Main Thread"+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("MainThread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}