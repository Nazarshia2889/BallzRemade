import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class Launcher extends Block
{
	private int xSpeed;
	private int topX;
	private int topY;
	private int rotateSpeed;
	private int initalAngle;

	public Launcher()
	{
		super(200,200);
		xSpeed = 1;
		topX = 200;
		topY = 200 - 50;
		rotateSpeed = 1;
		
	}

	//add the other Ball constructors
	public Launcher(int x, int y) {
		super(x, y);
		xSpeed = 1;
		topX = x;
		topY = y - 50;
		rotateSpeed = 1;
	}
	
	public Launcher(int x, int y, int width) {
		super(x, y, width);
		xSpeed = 1;
		topX = x;
		topY = y - 50;
		rotateSpeed = 1;
	}
	
	public Launcher(int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed = 1;
		topX = x;
		topY = y - height;
		rotateSpeed = 1;
	}
	
	public Launcher(int x, int y, int width, int height, Color col) {
		super(x, y, width, height, col);
		xSpeed = 1;
		topX = x;
		topY = y - height;
		rotateSpeed = 1;
	}
	
	public Launcher(int x, int y, int width, int height, int newXSpeed, int newRotateSpeed) {
		super(x, y, width, height);
		xSpeed = newXSpeed;
		topX = x;
		topY = y - height;
		rotateSpeed = newRotateSpeed;
	}
	
	public Launcher(int x, int y, int width, int height, Color col, int newXSpeed, int newRotateSpeed) {
		super(x, y, width, height, col);
		xSpeed = newXSpeed;
		topX = x;
		topY = y - height;
		rotateSpeed = newRotateSpeed;
		initalAngle = 90;
	}
	
	
	   
   //add the set methods
	
   public int getXSpeed() {
	   return xSpeed;
   }
   
  
   public void setXSpeed(int newXSpeed) {
	   xSpeed = newXSpeed;
   }
   
   public void setRotateSpeed(int newRotateSpeed) {
	   rotateSpeed = newRotateSpeed;
   }
   
   public void setTopX(int newX) {
	   topX = newX;
   }
   
   public void setTopY(int newY) {
	   topY = newY;
   }
  
   
   

   public void moveRightAndDraw(Graphics window)
   {
   	//draw a white line at old line location
	  draw(window, Color.GRAY);

	  if(getX() < 800 - getWidth()) {
		  setX(getX() + xSpeed);
	   }
      
      draw(window, this.getColor());

		//draw the ball at its new location
   }
   
   public void moveLeftAndDraw(Graphics window)
   {
   	//draw a white line at old line location
	  super.draw(window, Color.GRAY);

	  if(getX() > 5) {
		  setX(getX() - xSpeed);
	   }
//      setTopX(topX - xSpeed);
      
      super.draw(window, this.getColor());

		//draw the ball at its new location
   }
   
  
   
	public boolean equals(Object obj)
	{
		if(this.toString().equals(obj.toString())) {
			return true;
		}
		return false;
	}   

   //add the get methods

   //add a toString() method
	
	public String toString() {
		return "xSpeed: " + xSpeed;
	}
}