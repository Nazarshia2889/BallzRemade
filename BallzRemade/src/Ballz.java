//(c) F- Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
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
	private NumberBlocksss blocks;
	private BallGroup balls;
	private boolean[] keys;
	private BufferedImage back;

	private int xSpeedBall;
	private int ySpeedBall;

	private boolean isPlaying;
	public Ballz()
	{
		//set up all variables related to the game
//		ball = new Ball(100, 100, 10, 10, Color.RED, 1, 2);

		launcher = new Launcher(470, 550, 20, 20, Color.GREEN, 3, -20);
		blocks = new NumberBlocksss(25,30);
		balls = new BallGroup();
//		blocks.add(new NumberBlock(100, 100, 30, 30, 17));
//		balls.add(new Ball(500, 300, 10, 10, Color.BLACK, -1, -1));
		xSpeedBall = 0;
		ySpeedBall = -3;

		keys = new boolean[5];
		isPlaying=true;

    	setBackground(Color.GRAY);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}

   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
	   if(isPlaying) {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics2D graphToBack = back.createGraphics();
	
		launcher.draw(graphToBack);
		
	
		if(keys[0] == true) {
			if(xSpeedBall != -3) {
				xSpeedBall--;
			}
			keys[0]=false;
		}
		else if(keys[1] == true) {
			if(xSpeedBall != 3) {
				xSpeedBall++;
			}
			keys[1]=false;
		}

		if(keys[2] == true) {
			launcher.moveLeftAndDraw(graphToBack);
		}

		else if(keys[3] == true) {
			launcher.moveRightAndDraw(graphToBack);
		}
		
		if(keys[4] == true) {
			balls.add(new Ball(launcher.getX(), launcher.getY(), 10, 10, Color.BLACK, xSpeedBall, ySpeedBall));
			keys[4] = false;
		}

		blocks.drawEmAll(graphToBack); 
		balls.moveAndDrawEmAll(graphToBack, blocks);
//		launcher.draw(graphToBack);
		blocks.destroy(graphToBack);
		if(blocks.getList().size()==0) {
			graphToBack.setColor(Color.GREEN);
			graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 100));
			graphToBack.drawString("YOU WIN!!!!!!", 200, 400);
			twoDGraph.drawImage(back, null, 0, 0);
			isPlaying=false;
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}
   }
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}

	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}

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