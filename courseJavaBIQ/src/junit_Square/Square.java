package junit_Square;

public class Square {
	private Point  topLeft ;
	private Point  bottomRight ;
	
    public Square (Point  topLeft, Point   bottomRight ) {
		this.topLeft=topLeft;
    	this.bottomRight=bottomRight;
	}
    
   public int getArea() {
	
	  int  area = (topLeft.getY() - bottomRight.getY()) * (topLeft.getX() - bottomRight.getX());
	   if (area<0) {
		   System.out.println(area);
		   return (int) (area*(-1));  
	   }
	   else {
		   return (int) area;
	   } 
   }
    
    public int getPerimeter() {
		
    	int  perimeter = (topLeft.getY() - bottomRight.getY())*2 + (topLeft.getX() - bottomRight.getX())*2;
   
    	return (int) perimeter;
    	
    }
    
}
