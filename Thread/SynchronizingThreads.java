class msg{
    public void msgCall(String Msg){
        try {
                System.out.print("["+Msg);
                Thread.sleep(1000);
                System.out.println("]");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
class ThreadDemo implements Runnable{
    msg m;
    String Msg;
    Thread t;
    public ThreadDemo(msg Message,String Msg){
        t=new Thread(this);
        m=Message;
        this.Msg=Msg;
        t.start();
    }
    public void run(){
        synchronized(m){
            m.msgCall(Msg);
        }
    }
}
class SynchronizingMain{
    public static void main(String[] args) {
        msg Message=new msg();
        ThreadDemo t1=new ThreadDemo(Message,"Hello");
        ThreadDemo t2=new ThreadDemo(Message,"Synchronizing");
        ThreadDemo t3=new ThreadDemo(Message,"Threads");
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}