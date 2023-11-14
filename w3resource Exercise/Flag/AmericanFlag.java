class AmericanFlag{
    public static void main(String[] args) {
        for(int i=1;i<=15;i++){
            for(int j=1;j<=40;j++){
                if(i<=9&&j<=11){
                    if(i%2!=0){
                        if(j%2!=0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else{
                        if(j%2==0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                else{
                    if(j==12&&i<10)
                        System.out.print(" ");
                    else
                        System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}