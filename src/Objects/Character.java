package Objects;

import javax.swing.ImageIcon;

public class Character {
	ImageIcon[] frames;
	static ImageIcon frame; 
	int posX;
	int posY;
	
	public Character(int frames, int posX, int posY) {
		this.frames = new ImageIcon[frames];
		
		frame = this.frames[0];			
	}
	
	public void StartAnim() {
		//executar thread
	}
	
	public void StopAnim() {
		//kill thread
	}
}
