interface GenericInterface<T extends Comparable<T>>{
    T min();
    T max();
}
class MinMax<T extends Comparable<T>> implements GenericInterface<T>{
    T[] vals;
    MinMax(T[] o){
        vals=o;
    }
    public T min(){
        T v=vals[0];
        for(int i=1;i<vals.length;i++)
            if(v.compareTo(vals[i])<0) v=vals[i];
        return v;
    }
    public T max(){
        T v=vals[0];
        for(int i=1;i<vals.length;i++)
            if(v.compareTo(vals[i])>0) v=vals[i];
        return v;
    }
}
class GenIFDemo {
    public static void main(String args[]) {
    Integer inums[] = {3, 6, 2, 8, 6 };
    Character chs[] = {'b', 'r', 'p', 'w' };
    MinMax<Integer> iob = new MinMax<Integer>(inums);
    MinMax<Character> cob = new MinMax<Character>(chs);
    System.out.println("Max value in inums: " + iob.max());
    System.out.println("Min value in inums: " + iob.min());
    System.out.println("Max value in chs: " + cob.max());
    System.out.println("Min value in chs: " + cob.min());
    }
}