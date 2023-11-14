class SetPriority implements Runnable{
    public long click=0;
    Thread t;
    public volatile boolean running=true;
    SetPriority(int p){
        t=new Thread(this);
        t.setPriority(p);
    }
    public void run(){
        while(running)
            click++;
    }
    public void stop(){
        running=false;
    }
}
class PriorityTest{
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        SetPriority h=new SetPriority(Thread.NORM_PRIORITY+2);
        SetPriority l=new SetPriority(Thread.NORM_PRIORITY-2);
        h.t.start();
        l.t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        h.stop();
        l.stop();
        try {
            h.t.join();
            l.t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Higher: "+h.click);
        System.out.println("lower: "+l.click);
    }
}