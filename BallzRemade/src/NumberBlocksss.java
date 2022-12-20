import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class NumberBlocksss {
	private List<NumberBlock> blocks;
	
	public NumberBlocksss() {
		blocks = new ArrayList<NumberBlock>();
	}
	
	public void add(NumberBlock block) {
		blocks.add(block);
	}
	
	public void drawEmAll(Graphics window) {
		for(NumberBlock block: blocks) {
			block.draw(window);
		}
	}
	
	public void destroy() {
		for(int i = 0; i < blocks.size(); i++) {
			if(blocks.get(i).getNum() <= 0) {
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
