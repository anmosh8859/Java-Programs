public class Main {
    public static void main(String[] args) {
        Thread t1= Thread.currentThread();
        System.out.println("Current Thread: " + t1);//t1 will show [name,priority no, name of group in which func main is residing]
        t1.setName("Anand Mohan Sharma");
        System.out.println("Current Thread: " + t1);
        MyThread ti= new MyThread("First: ",1);
        MyThread tii= new MyThread("Second: ",2);
        MyThread tiii= new MyThread("Third: ",1);
        MyThread tiv= new MyThread("Fourth: ",2);
        ti.t.start();
        tii.t.start();
        tiii.t.start();
        tiv.t.start();
        try{
            ti.t.join();
            tii.t.join();
            tiii.t.join();
            tiv.t.join();
            t1.join();
        }catch (InterruptedException i){}
    }
}