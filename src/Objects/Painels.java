package Objects;

import java.awt.Color;
import javax.swing.JPanel;
import Main.Janela;

public class Painels extends JPanel {
	
	public Painels(double size_fluid) {
		size_fluid *= Janela.telaHeight;
		setLayout(null);
		setBackground(Color.BLACK);
		setBounds(0, (int) (Janela.telaHeight - size_fluid), 
				Janela.telaWidth, (int) (size_fluid));
	}
}
