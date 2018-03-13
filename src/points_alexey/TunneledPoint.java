package points_alexey;

public class TunneledPoint extends Point {


    public TunneledPoint(int x, int y) {
        super(x, y);
    }
    public TunneledPoint(){
        super();
    }


    @Override
    public void move(){
        super.move();

        int myX = getX();
        int myY = getY();

        if(myX==width){
            setX(1);
        }
        if (myY==height){
            setY(1);
        }
        System.out.println(super.toString());

    }

    @Override
    public void move(int nextX, int nextY) {
        if((getX() + nextX) < width && (getY() + nextY) < height) {

            super.move(nextX, nextY);

        }else if((getX() + nextX) > width && (getY() + nextY) < height)  {

            super.move(calculatedX(nextX), nextY);

        }else if((getX() + nextX) < width && (getY() + nextY) > height)  {
            super.move( nextX , calculatedY(nextY));
        }
        else {super.move( calculatedX(nextX), calculatedY(nextY));}

        System.out.println(super.toString());

    }

    private int calculatedY (int y) {
        return (y-height);
    }

    private int calculatedX (int x) {
         return (x-width);
    }
}
