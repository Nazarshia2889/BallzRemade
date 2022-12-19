//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed = 5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}
   public Paddle(int x, int y, int width) {
		super(x, y, width);
		speed = 5;
	}
	
	public Paddle(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}
	
	public Paddle(int x, int y, int width, int height, Color col) {
		super(x, y, width, height, col);
		speed = 5;
	}
	
	public Paddle(int x, int y, int width, int height, int newSpeed) {
		super(x, y, width, height);
		speed = newSpeed;
	}
	
	public Paddle(int x, int y, int width, int height, Color col, int newSpeed) {
		super(x, y, width, height, col);
		speed = newSpeed;
	}


   public void moveUpAndDraw(Graphics window)
   {
	  draw(window, Color.WHITE);
	  if(getY() > 5) {
		  setY(getY() - speed);
	  }
      draw(window, this.getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   if(getY() < 600 - getHeight()) {
		   setY(getY() + speed);
	   }
	   draw(window, this.getColor());

   }

   //add get methods
   
   public int getSpeed() {
	   return speed;
   }
   
   
   //add a toString() method
   
   public String toString() {
	   return "Speed: " + speed;
   }
}