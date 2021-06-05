package LIXEIRA;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class Button extends JLabel {
	//JLabel btt = new JLabel();
	
	public Button(String text) {
		//btt = new Componente<JButton>((byte)0).getComponente();
		setText(text);
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setFont(new Font("Dialog", 1, (int) (Jogo.telaHeight * 0.06)));
		setHorizontalAlignment(JLabel.CENTER);
		setOpaque(true);
		//setBorder(null);
		
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {
				setForeground(Color.WHITE);
				setBackground(Color.BLACK);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				setForeground(Color.DARK_GRAY);
				setBackground(Color.WHITE);
			}
		});
		
		//return btt;
	}
}
