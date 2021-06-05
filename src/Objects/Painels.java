package Objects;

import java.awt.Color;
import javax.swing.JPanel;
import Main.Jogo;

public class Painels extends JPanel {
	
	public Painels(double size_fluid) {
		size_fluid *= Jogo.telaHeight;
		setLayout(null);
		setBackground(Color.BLACK);
		setBounds(0, Jogo.telaHeight - (int)size_fluid, 
				Jogo.telaWidth, (int)size_fluid);
	}
}
