package points_alexey;

public class Main {
    public static void main(String[] args) {
        Point myBPoint = new BouncingPoint(5,3);
        Point myTunnelPoint = new TunneledPoint(5,3);
        Point.setHeight(11);
        Point.setWidth(11);
//        for(int i = 0; i< 25; i++) {
//            myBPoint.move();
//        }
       //myBPoint.move(11,2);

//        for(int i =0; i< 22; i++) {
//            myTunnelPoint.move();
//        }
       // myTunnelPoint.move(6,9);
        myBPoint.move(8,9);
        myBPoint.move(2,2);








    }
}
