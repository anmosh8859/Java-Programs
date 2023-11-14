class Outer{
    int x=4;
    static int y;
    public static void fun(int x){
        y=x;
    }
    static class Inner{
        public static int x;
    }
}
class Static{
    public static void main(String[] args){
        Outer.y=10;
        System.out.println(Outer.y);
        Outer.fun(12);
        System.out.println(Outer.y);
        System.out.println(Outer.Inner.x);
    }
}