package points_alexey;

public class BouncingPoint extends Point {

    public BouncingPoint(int x, int y) {
        super(x,y);
    }
    public BouncingPoint(){
        super();
    }
    @Override
    public void move(){

        super.move();

        int myX = getX();
        int myY = getY();

        if(myX==width|| myX==0){
            flipDirectionX();
            }
        if (myY==height || myY==0){
                flipDirectionY();
            }
        System.out.println(super.toString());

    }
    @Override
    public void move(int nextX, int nextY) {
        if((getX() + nextX) < width && (getY() + nextY) < height) {
            super.move(nextX, nextY);
        }else  if((getX() + nextX) > width && (getY() + nextY) < height){
            super.move(calculateX(nextX), nextY);
            flipDirectionX();
        }else  if((getX() + nextX) > width && (getY() + nextY) > height){
            super.move(calculateX(nextX), calculateY(nextY));
            flipDirectionX();
            flipDirectionY();
        }
        System.out.println(super.toString());
    }

    private int calculateY(int nextY) {
        return  (height - (Math.abs(height-(getY()+nextY)))- getY());
    }

    private int calculateX(int nextX) {
        return  (width - (Math.abs(width-(getX()+nextX)))-getX());
    }

}
