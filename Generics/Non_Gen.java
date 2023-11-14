class Non_Generics{
    Object ob;
    Non_Generics(Object o){
        ob=o;
    }
    Object getObject(){
        return ob;
    }
    void showType(){
        System.out.println("Object is of: "+ob.getClass().getName());
    }
}
class Non_GenDemo{
    public static void main(String[] args) {
        Non_Generics gen=new Non_Generics(88);
        gen.showType();
        System.out.println("Value: "+(Integer)gen.getObject()+"\n");
        Non_Generics gen1=new Non_Generics("String");
        gen1.showType();
        System.out.println("Value: "+(String)gen1.getObject());
    }
}