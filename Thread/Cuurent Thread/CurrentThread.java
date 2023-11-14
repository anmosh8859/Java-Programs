class CurrentThread{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        t.setName("My program");
        System.out.println("After Name Change: "+t);
        System.out.println(t.getName());
        try {
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}