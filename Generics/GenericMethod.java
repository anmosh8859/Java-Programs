class GenericMethod{
    static <T,V extends T> boolean isIn(T x,V[] y){
        for(T z:y)
            if(x.equals(z)) return true;
        return false;
    }
    public static void main(String[] args) {
        Integer nums[] = { 1, 2, 3, 4, 5 };
        if(isIn(2, nums))
        System.out.println("2 is in nums");
        if(!isIn(7, nums))
        System.out.println("7 is not in nums");
        System.out.println();
        String strs[] = { "one", "two", "three",
        "four", "five" };
        if(isIn("two", strs))
        System.out.println("two is in strs");
        if(!isIn("seven", strs))
        System.out.println("seven is not in strs");
    }
}