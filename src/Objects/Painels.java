package Objects;

import javax.swing.JPanel;
import Main.Window;

public class Painels extends JPanel {
	
	public Painels(double size_fluid) {
		size_fluid *= Window.telaHeight;
		setLayout(null);
		setOpaque(false);
		setBounds(0, Window.telaHeight - (int)size_fluid, 
				Window.telaWidth, (int)size_fluid);
	}
}
