package Objects;

import java.awt.Color;
import javax.swing.JPanel;
import Main.Jogo;

public class Painels extends JPanel {
	
	public Painels(double size_fluid) {
		setLayout(null);
		setBackground(Color.BLACK);
		setBounds(0, (int) (Jogo.telaHeight * (1-size_fluid)), 
				Jogo.telaWidth, (int) (Jogo.telaHeight * size_fluid));
	}
}
