package LIXEIRA;
import javax.swing.JPanel;

public class Painel extends JPanel {
	
	public Painel(int Height) {
		setLayout(null);
		setBackground(getBackground().BLACK);
		setBounds(0, Jogo.telaHeight-Height, Jogo.telaWidth, Height);
	}
}
