//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 100;
		height = 100;
		color = Color.black;

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int newWidth, int newHeight) {
		setPos(x, y);
		width = newWidth;
		height = newHeight;
		color = Color.black;
	}
	
	public Block(int x, int y) {
		setPos(x, y);
		width = 100;
		height = 100;
		color = Color.black;
	}
	
	public Block(int x, int y, int newWidth) {
		setPos(x, y);
		width = newWidth;
		height = 100;
		color = Color.black;
	}
	
	public Block(int x, int y, int newWidth, int newHeight, Color newColor) {
		setPos(x, y);
		width = newWidth;
		height = newHeight;
		setColor(newColor);
	}
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;

   }
   
   public void setPos(int x, int y) {
	   xPos = x;
	   yPos = y;
   }
   
   public void setX(int x) {
	   xPos = x;
   }
   
   public void setY(int y ) {
	   yPos = y;
   }
   
   public int getX() {
	   return xPos;
   }
   
   public int getY() {
	   return yPos;
   }
   
   public int getWidth() {
	   return width;
   }
   
   public int getHeight() {
	   return height;
   }
   
   public Color getColor() {
	   return color;
   }
   

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		if(this.toString().equals(obj.toString())) {
			return true;
		}
		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	
	public String toString() {
		return "xPos: " + xPos + ", yPos: " + yPos + ", Width: " + width + ", Height: " + height;
	}
}