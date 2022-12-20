//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int size;
	private int xSpeed;
	private int ySpeed;
	private boolean exists;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors
	public Ball(int x) {
		super(x, 150, 10, 10, Color.black);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(x, y, 10, 10, Color.black);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int z) {
		super(x, y, z, z, Color.black);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs) {
		super(x, y, w, h, c);
		xSpeed = xs;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x, y, w, h, c);
		xSpeed = xs;
		ySpeed = ys;
	}

	// add the set methods
	public void setXSpeed(int xs) {
		xSpeed = xs;
	}

	public void setYSpeed(int ys) {
		ySpeed = ys;
	}

	public void setSize(int z) {
		size = z;
	}

	public boolean isExisting() {
		return exists;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		Color temp = window.getColor();
		window.setColor(Color.GRAY); // whatever background color is
		window.fillOval(getX(), getY(), size, size);

		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		// draw the ball at its new location
		window.setColor(Color.blue);
		window.fillOval(getX(), getY(), size, size);
		window.setColor(temp);
	}

	public void adjustSpeed() {
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
			setXSpeed(0);
			setYSpeed(0);
		}
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

	public int getSize() {
		return size;
	}

	// add a toString() method
	public String toString() {
		return (super.toString() + getXSpeed() + " " + getYSpeed());
	}
}

