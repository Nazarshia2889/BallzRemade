import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NumberBlock extends Block {
	private int num;
	
	public NumberBlock() {
		super(0, 0);
		num=0;
		calculateColor();
	}
	public NumberBlock(int num) {
		super(0, 0);
		this.num=num;
		calculateColor();
	}
	public NumberBlock(int x, int y, int num) {
		super(x, y);
		this.num=num;
		calculateColor();
	}
	public NumberBlock(int x, int y, int width, int height, int num) {
		super(x, y, width, height);
		this.num=num;
		calculateColor();
	}
	
	public void calculateColor() {
		if(num <= 7) {
			setColor(Color.YELLOW);
		}else if(num <= 14) {
			setColor(Color.RED);
		}else if(num <= 21) {
			setColor(Color.GREEN);
		}else if(num <= 28) {
			setColor(Color.BLUE);
		}else {
			setColor(Color.MAGENTA);
		}
	}
	
	public void setNum(int num) {
		this.num=num;
		calculateColor();
	}
	public int getNum() {
		return num;
	}
	
	public void destroy(Graphics window) {
		window.setColor(Color.GRAY);
	    window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics window) {
		window.setColor(getColor());
	    window.fillRect(getX(), getY(), getWidth(), getHeight());
	    window.setColor(Color.GRAY);
	    window.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
	    window.drawString(num+"", getX(), getY()+getHeight());
	}
}
