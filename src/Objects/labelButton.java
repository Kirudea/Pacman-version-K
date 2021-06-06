package Objects;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import Interfaces.GenericInterface;
import Main.Window;

public class labelButton extends JLabel {
	
	public labelButton(String text, GenericInterface GI) {
		setText(text);
		//setOpaque(false);
		setForeground(Color.WHITE);
		setFont(new Font("Dialog", 1, (int)(Window.telaHeight*0.056)));
		setHorizontalAlignment(JLabel.CENTER);
		
		if(GI != null) {
			addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent e) {}			
				@Override
				public void mousePressed(MouseEvent e) {}
				@Override
				public void mouseExited(MouseEvent e) {
					setForeground(Color.WHITE);
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					setForeground(Color.DARK_GRAY);
				}			
				@Override
				public void mouseClicked(MouseEvent e) {
					GI.Method();					
				}
			});
		}
	}
}