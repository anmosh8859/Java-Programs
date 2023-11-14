class gen<t extends Number>{
    t[] ob;
    gen(t[] o){
        ob=o;
    }
    double average(){
        double sum=0.0;
        for(t x:ob)
            sum+=x.doubleValue();
        double avg=sum/ob.length;
        return avg;
    }
    boolean isSame(gen<?> o){
        if(average()==o.average())
            return true;
        return false;
    }
}
class genDemo{
    public static void main(String[] args) {
        Integer inum[]={1,2,3,4,5,6,7};
        gen<Integer> gennum=new gen<Integer>(inum);
        System.out.println("Average: "+gennum.average());
        Float fnum[]={2.4f,5.6f,4.5f,3.5f};
        gen<Float> floatnum=new gen<Float>(fnum);
        System.out.println("Average: "+floatnum.average());
        System.out.println("Averages are Same: "+gennum.isSame(floatnum));
    }
}