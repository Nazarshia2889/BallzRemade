import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class NumberBlocksss {
	private List<NumberBlock> blocks;
	
	public NumberBlocksss() {
		this(0, 1);
	}
	public NumberBlocksss(int amount, int val) {
		blocks = new ArrayList<NumberBlock>();
		int xPos = 0;
		int yPos = 0;
		
		for(int i=0; i<amount; i++) {
			blocks.add(new NumberBlock(xPos, yPos, 30, 30, val));
			System.out.println(blocks.size());
			xPos+=32;
			if(xPos > 790) {
				xPos=0;
				yPos+=32;
			}
		}
	}
	
	public void add(NumberBlock block) {
		blocks.add(block);
	}
	
	public void drawEmAll(Graphics window) {
		for(NumberBlock block: blocks) {
			block.draw(window);
		}
	}
	
	
	public void destroy(Graphics wind) {
		for(int i = 0; i < blocks.size(); i++) {
			if(blocks.get(i).getNum() <= 0) {
				blocks.get(i).destroy(wind);
				blocks.remove(i);
			}
		}
	}
	
	public List<NumberBlock> getList() {
		return blocks;
	}
	
	public String toString() {
		return "";
	}
}
