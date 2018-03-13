package points_alexey;

public abstract class Point {

	    private int x;
	    private int y;
	    protected int directionX=1;
	    protected int directionY=1;
	    public static int width;
	    public static int height;
	
	public Point() {
    }
	public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public  void move(){
        this.x = this.x + directionX;
        this.y = this.y + directionY;
    }

    public void flipDirectionY(){
        directionY = directionY - 2 * directionY;
    }

    public void flipDirectionX(){
        directionX = directionX - 2 * directionX;
    }
    public  void move(int x,int y){
        this.x = this.x + x * directionX;
        this.y = this.y + y * directionY;
    }

	
    public int getDirectionX() {
        return directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

   

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public static void setWidth(int width) {
        Point.width = width;
    }
    
    public static void setHeight(int height) {
        Point.height = height;
    }
    
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    

    
}
