//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class BallGroup
{
	private List<Ball> balls;

	public BallGroup()
	{
		balls = new ArrayList<Ball>();
	}

	public void add(Ball al)
	{
		balls.add(al);
	}

	//post - draw each Ammo
	public void moveAndDrawEmAll( Graphics window )
	{
		for(Ball shot: balls) {
			shot.adjustSpeed();
			if(shot.isExisting()) shot.moveAndDraw(window);
			else balls.remove(balls.indexOf(shot));
		}
	}

	public List<Ball> getList()
	{
		return balls;
	}

	public String toString()
	{
		return balls.toString();
	}
}
