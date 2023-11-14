enum apple{
    Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
}
class EnumAsClass{
    public static void main(String[] args) {
        for(apple a:apple.values())
            System.out.println(a+"'s ordinal value: "+a.ordinal());
        System.out.println();
        apple ap=apple.Jonathan,ap1=apple.GoldenDel,ap2=apple.Jonathan;
        if(ap.compareTo(ap1)<0)
            System.out.println("Jonathan comes before GoldenDel");
        if(ap.compareTo(ap1)>0)
            System.out.println("Jonathan comes after GoldenDel");
        if(ap.compareTo(ap2)==0)
            System.out.println("Jonathan equals Jonathan");
        System.out.println();
        if(ap.equals(ap1))
            System.out.println("Error!");
        if(ap.equals(ap2))
            System.out.println(ap+" equals "+ap2);
    }
}