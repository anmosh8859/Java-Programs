enum apple{
    Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
    private int price;
    apple(int p){
        price=p;
    }
    int getPrice(){
        return price;
    }
}
class EnumAsClass{
    public static void main(String[] args) {
        System.out.println("Jonathan costs: "+apple.Jonathan.getPrice()+"cents");
        for(apple a:apple.values())
            System.out.println(a+"costs: "+a.getPrice()+"cents");
    }
}