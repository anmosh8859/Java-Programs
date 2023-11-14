public class wrapper{
    public static void main(String[] args) {
        Integer i=Integer.valueOf("123");
        int a=i.intValue();
        int b=Integer.parseInt("321");
        System.out.println(a+"and"+b);
        int s=0;
        for(int loop=0;loop<args.length;loop++)
            s=s+Integer.parseInt(args[loop]);
        System.out.println(s);
    }
}