//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 1;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width) {
		super(x, y, width);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, Color col) {
		super(x, y, width, height, col);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int newXSpeed, int newYSpeed) {
		super(x, y, width, height);
		xSpeed = newXSpeed;
		ySpeed = newYSpeed;
	}
	
	public Ball(int x, int y, int width, int height, Color col, int newXSpeed, int newYSpeed) {
		super(x, y, width, height, col);
		xSpeed = newXSpeed;
		ySpeed = newYSpeed;
	}
	
	
	   
   //add the set methods
	
   public int getXSpeed() {
	   return xSpeed;
   }
   
   public int getYSpeed() {
	   return ySpeed;
   }
	
   public void setXSpeed(int newXSpeed) {
	   xSpeed = newXSpeed;
   }
   
   public void setYSpeed(int newYSpeed) {
	   ySpeed = newYSpeed;
   }
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  super.draw(window, Color.WHITE);

      setX(getX() + xSpeed);
		//setY
      setY(getY() + ySpeed);
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
		return "xSpeed: " + xSpeed + ", ySpeed: " + ySpeed;
	}
}