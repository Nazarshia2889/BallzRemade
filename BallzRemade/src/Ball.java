//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;
	private boolean exists;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
		exists=true;
	}

	// add the other Ball constructors
	public Ball(int x) {
		super(x, 150, 10, 10, Color.black);
		xSpeed = 3;
		ySpeed = 1;
		exists=true;
	}

	public Ball(int x, int y) {
		super(x, y, 10, 10, Color.black);
		xSpeed = 3;
		ySpeed = 1;
		exists=true;
	}

	public Ball(int x, int y, int z) {
		super(x, y, z, z, Color.black);
		xSpeed = 3;
		ySpeed = 1;
		exists=true;
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
		exists=true;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs) {
		super(x, y, w, h, c);
		xSpeed = xs;
		ySpeed = 1;
		exists=true;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x, y, w, h, c);
		xSpeed = xs;
		ySpeed = ys;
		exists=true;
	}

	// add the set methods
	public void setXSpeed(int xs) {
		xSpeed = xs;
	}

	public void setYSpeed(int ys) {
		ySpeed = ys;
	}

	public boolean isExisting() {
		return exists;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		Color temp = window.getColor();
		window.setColor(Color.GRAY); // whatever background color is
		window.fillOval(getX(), getY(), getWidth(), getHeight());
	
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		// draw the ball at its new location
		window.setColor(getColor());
		window.fillOval(getX(), getY(), getWidth(), getHeight());
		window.setColor(temp);
	}

	public void adjustSpeed(NumberBlocksss blocks) {
		//check if it hits a numberBlock
		List<NumberBlock> blockss = blocks.getList();
		for(int i = 0; i<blockss.size(); i++) {
			NumberBlock b = blockss.get(i);
			//right
			if(getY() > b.getY()+b.getHeight() && getY() < b.getY()+b.getHeight()+5
					&& getX() < b.getX()+b.getWidth() && getX()+getWidth() > b.getX()) {
				setYSpeed(-getYSpeed());
				b.setNum(b.getNum()-1);
				System.out.println("bot");
			}
			else if(getX() > b.getX()+b.getWidth() && getX() < b.getX()+b.getWidth()+5
					&& getY()+getHeight() < b.getY()+b.getHeight() && getY() > b.getY()) {
				setXSpeed(-getXSpeed());
				b.setNum(b.getNum()-1);
				System.out.println("right");
			}
			//left
			else if(getX()+getWidth() < b.getX() && getX()+getWidth() > b.getX()-5
					&& getY()+getHeight() < b.getY()+b.getHeight() && getY() > b.getY()) {
				setXSpeed(-getXSpeed());
				b.setNum(b.getNum()-1);
				System.out.println("left");
			}
			//top
			else if(getY()+getHeight() < b.getY() && getY()+getHeight() > b.getY()-5
					&& getX() < b.getX()+b.getWidth() && getX() >= b.getX()) {
				setYSpeed(-getYSpeed());
				b.setNum(b.getNum()-1);
				System.out.println("top");
			}
			//bottom
			
		}
		if (getX() < 3) {
			setXSpeed(-xSpeed);
			setYSpeed(ySpeed);
		} else if (getX() > 797) {
			setXSpeed(-xSpeed);
			setYSpeed(ySpeed);
		}

		// see if the ball hits the top or bottom wall
		if (!(getY() >= 1)) {
			setXSpeed(xSpeed);
			setYSpeed(-ySpeed);
		} else if (!(getY() <= 560)) {
			exists = false;
//			setXSpeed(0);
//			setYSpeed(0);
		}
	}
	
	public void destroy(Graphics window) {
		window.setColor(Color.gray);
		window.fillOval(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		return super.equals(obj) && getXSpeed() == ((Ball) obj).getXSpeed() && getYSpeed() == ((Ball) obj).getYSpeed();
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}


	// add a toString() method
	public String toString() {
		return (super.toString() + getXSpeed() + " " + getYSpeed());
	}
}

