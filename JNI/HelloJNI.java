public class HelloJNI{
    static{
        System.loadLibrary("hello");
    }
    private native void hellojni();
    public static void main(String[] args) {
        new HelloJNI().hellojni();
    }
}