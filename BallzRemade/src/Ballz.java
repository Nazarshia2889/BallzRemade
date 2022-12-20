//(c) F- Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Ballz extends Canvas implements KeyListener, Runnable
{
	private Launcher launcher;
	private ArrayList<NumberBlock> blocks;
	private BallGroup balls;
	private boolean[] keys;
	private BufferedImage back;



	public Ballz()
	{
		//set up all variables related to the game
//		ball = new Ball(100, 100, 10, 10, Color.RED, 1, 2);
//		ball = new SpeedUpBall(100, 100, 10, 10, Color.RED, xSpeed, ySpeed);

		launcher = new Launcher(400, 550, 100, 20, Color.GREEN);
		blocks = new ArrayList<NumberBlock>();
		balls = new BallGroup();
		blocks.add(new NumberBlock(100, 100, 30, 30, 42));
		balls.add(new Ball(500, 200));
		

		keys = new boolean[4];


    	setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}

   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		launcher.draw(graphToBack);
		for(NumberBlock n : blocks) n.draw(graphToBack);
		balls.moveAndDrawEmAll(graphToBack);

	
		if(keys[0] == true) {
			
		}
		else if(keys[1] == true) {
			
		}

		if(keys[2] == true) {
			
		}

		else if(keys[3] == true) {
			
		}



		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e){}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}