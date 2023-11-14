import java.util.Scanner;
class Earth{
    public static void main(String[] args) {
        java.util.Scanner s=new Scanner(System.in);
        System.out.print("Enter the latitude of co-ordinate 1: ");
        double lat1=s.nextDouble();
        System.out.print("Enter the longitude of co-ordinate 1: ");
        double long1=s.nextDouble();
        System.out.print("Enter the latitude of co-ordinate 2: ");
        double lat2=s.nextDouble();
        System.out.print("Enter the longitude of co-ordinate 2: ");
        double long2=s.nextDouble();
        System.out.println("Distance b/w points: "+(6371.01*Math.acos(Math.sin(Math.toRadians(lat1))*Math.sin(Math.toRadians(lat2))+(Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(long1)-Math.toRadians(long2)))))+"km");
    }// earthRadius:6371.01     "arr=earthRadius*arccos(sin(lat1)*cos(lat2)+cos(lat1)*cos(lat2)*cos(long2-long1))" **All coordiates must be in radians**
}