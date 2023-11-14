enum apple{
    Jonathan,GoldenDel,RedDel,Winesap,Cortland
}
class EnumDemo{
    public static void main(String[] args) {
        apple ap;
        ap=apple.Winesap;
        System.out.println("Value of ap: "+ap);
        ap=apple.GoldenDel;
        if(ap==apple.GoldenDel)
            System.out.println("ap is now GoldenDel.\n");
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is Red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is Yellow.");
                break;
            case RedDel:
                System.out.println("Winesap is Red.");
                break;
            case Cortland:
                System.out.println("Cortlan is Red.");
                break;
            default:
                break;
        }
    }
}