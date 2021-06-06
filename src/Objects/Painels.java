package Objects;

import javax.swing.JPanel;
import Main.Janela;

public class Painels extends JPanel {
	
	public Painels(double size_fluid) {
		size_fluid *= Janela.telaHeight;
		setLayout(null);
		setOpaque(false);
		setBounds(0, Janela.telaHeight - (int)size_fluid, 
				Janela.telaWidth, (int)size_fluid);
	}
}
