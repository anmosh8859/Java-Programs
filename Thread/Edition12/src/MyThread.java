public class MyThread implements Runnable {
    Thread t;
    MyThread(String name, int priority){
        t= new Thread(this,name);
        t.setPriority(priority);
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println((i+1)+t.getName());
            try{Thread.sleep(1000);}catch (Exception e){}
        }
        System.out.println("Thread "+t.getName()+" is ended...");
    }
}
