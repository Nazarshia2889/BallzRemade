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
		System.out.println(balls.size());
		balls.add(al);
		System.out.println(balls.size());
	}

	//post - draw each Ammo
	public void moveAndDrawEmAll( Graphics window )
	{
		for(int i = 0; i<balls.size(); i++) {

			balls.get(i).adjustSpeed();
			if(balls.get(i).isExisting()) {
				balls.get(i).moveAndDraw(window);
			}
			else balls.remove(balls.indexOf(balls.get(i)));
			System.out.println(balls.size());
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
