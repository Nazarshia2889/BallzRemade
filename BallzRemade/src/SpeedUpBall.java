//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends BlinkyBall
{

   //instance variables
	private int xSpeed;
	private int ySpeed;

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col);
	   xSpeed = xSpd;
	   ySpeed = ySpd;

   }
   @Override
   public void setXSpeed( int xSpd ) {
	 if(xSpd > 0) {
		 xSpeed = xSpd + 2;
	 }
	 else if(xSpd < 0) {
		 xSpeed = xSpd - 2;
	 }
	 else {
		 xSpeed = xSpd;
	 }

   }

   @Override
   public void setYSpeed( int ySpd )
   {
	   if(ySpd > 0) {
		   ySpeed = ySpd + 1;
	   }
	   else if (ySpd < 0) {
		   ySpeed = ySpd - 1;
	   }
	   else {
		   ySpeed = ySpd;
	   }
   }
   
   @Override
   public int getXSpeed()
   {
	 return xSpeed;

   }
   
   @Override
   public int getYSpeed()
   {
	 return ySpeed;

   }
   
}

