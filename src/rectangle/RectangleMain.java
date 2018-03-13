package rectangle;

public class RectangleMain {

	public static void main(String[] args) {
		
		Rectangle recPlayer1 = new Rectangle(1, 1, 10, 10);
	    Rectangle recPlayer2 = new Rectangle(0, 0, 6, 6);
	    
	    play(recPlayer1,recPlayer2);

	}
       public static void play (Rectangle recPlayer1,Rectangle recPlayer2) {
    	 int r1x1 =  recPlayer1.getX1();
    	 int r2x1 =  recPlayer2.getX1();
    	 
    	   
    	   
    	 if (recPlayer1.getX1()<=recPlayer2.getX1()&&recPlayer1.getY1()<=recPlayer2.getY1()
    	   &&recPlayer1.getX2()>=recPlayer2.getX2()&&recPlayer1.getY1()>=recPlayer2.getY2()) {
    		
    		 System.out.println("Player1 is Win" );
    	 }
	
       }
}
