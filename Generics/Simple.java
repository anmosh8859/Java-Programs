class Non_Generics<t>{
    t ob;
    Non_Generics(t o){
        ob=o;
    }
    t getObject(){
        return ob;
    }
    void showType(){
        System.out.println("Object is of: "+ob.getClass().getName());
    }
}
class Non_GenDemo{
    public static void main(String[] args) {
        Non_Generics<Integer> gen=new Non_Generics<Integer>(88);
        gen.showType();
        System.out.println("Value: "+gen.getObject()+"\n");
        Non_Generics<String> gen1=new Non_Generics<String>("String");
        gen1.showType();
        System.out.println("Value: "+gen1.getObject());
    }
}