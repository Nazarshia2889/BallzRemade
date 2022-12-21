import java.awt.Color;
import java.awt.Graphics;

public class Launcher extends Block
{
	private int xSpeed;
	private int topX;
	private int topY;
	private int rotateSpeed;

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
  
   
   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.drawLine(topX, topY, getX(), getY());
	   
   }
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white line at old line location
	  draw(window, Color.GRAY);

      setX(getX() + xSpeed);
      
      draw(window, this.getColor());

		//draw the ball at its new location
   }
   
   public void rotateAndDraw(Graphics window) {
	   draw(window, Color.GRAY);
	   
	   setTopX(topX + rotateSpeed);
	   System.out.println(topX+" "+getX());
	   setTopY((int) Math.sqrt(Math.pow(getHeight(), 2) - Math.pow(topX-getX(), 2)));
	   
	   draw(window, this.getColor());
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