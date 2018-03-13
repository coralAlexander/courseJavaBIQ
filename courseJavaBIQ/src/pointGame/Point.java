package pointGame;

public abstract class Point {

	private static int  height=10;
	private static int  weight=10;
	private  int  x;
	private  int  y;
	private int directionX;
	private int directionY;
	
	public Point (int  x,int  y, int directionX,int directionY) {
		this.x=x;
		this.y=y;
		this.directionX=directionX;
		this.directionY=directionY;
	}
	
	public void move() {
		
		if (directionX <= 0 && directionY <= 0) {
			x=x+directionX;
			y=y+directionY;
			if (x==0&&y>0) {
				int ytemp=y;
				x = weight;
				y = height-ytemp; 
			}
			else if (y==0 && x>0){
				int xtemp=x;
				x = weight-xtemp;
				y = height;
			}
			else if (x==0 && y==0){
				System.out.println("X :"+x+" Y :" +y);
				x = weight;
				y = height;
			}
			
			System.out.println("X :"+x+" Y :" +y);
		}
		else if(directionX >= 0 && directionY >= 0) {
			
		}
		else if (directionX <= 0 && directionY >= 0) {
			
		}
		else if(directionX >= 0 && directionY <= 0) {
			
		}
		
		
		
		
		/*if(x< height && y<weight) {
			if(x==0&&y==0) {
				x=x+directionX;
				y=y+directionY;
			}
			else {
				x=x+directionX;
				y=y+directionY;
			}
			
			
		}
		else {
			int tempY=y;
			y=x;
			x=tempY;
			x=x+directionX;
			y=y+directionY;	
		}
		System.out.println("X :"+x+" Y :" +y);*/
	}

	
	
}
