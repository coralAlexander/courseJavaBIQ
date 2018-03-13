package points_alexey;

public class MyScreen {
    private int height;
    private int width;

    public MyScreen(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean isPointInTheCorner(int x,int y){
        if(x != 0|| y != 0 || x!=width || y != height) {
            return true;}
        return false;

    }

    public boolean isPointHeatTheWall(int x,int y){

        if(x!=width || y!= height) {
            return true;
        }
        return false;
    }
}
