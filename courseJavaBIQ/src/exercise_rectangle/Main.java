package exercise_rectangle;

public class Main {
    public static void main(String[] args) {

        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        int x3 = Integer.parseInt(args[4]);
        int y3 = Integer.parseInt(args[5]);
        int x4 = Integer.parseInt(args[6]);
        int y4 = Integer.parseInt(args[7]);

        printinput(x1,x2,x3,x4,y1,y2,y3,y4);

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3 ,y3);
        Point p4 = new Point(x4,y4);
        Rectangle r1 = new Rectangle(p1 , p2);
        Rectangle r2 = new Rectangle(p3 , p4);

       // System.out.println(r1.isFirstContainesSecond(r2));


        int result = r1.whoIsWinner(r2);

        switch (result){
            case 1:
                System.out.println("The first player is winner !!!");
                break;
            case -1:
                    System.out.println("The second is winner !!!");
                break;
            case 0:
                        System.out.println("Teko !!!");
                break;
        }
        }

    private static void printinput(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4) {
        System.out.println("Rectangle  points are "+ x1 +" " +y1+" "+ x2 +" "+y2+" "+x3+" "+ y3 +" "+x4+" " + y4);
    }

}

