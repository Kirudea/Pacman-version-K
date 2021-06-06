package Main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Interfaces.GenericInterface;
import Objects.Painels;
import Objects.labelButton;

public class Janela extends JFrame {
	// Screen Size
	public static int telaWidth;
	public static int telaHeight;

	public Janela() {
		// Tela
		setTitle("Pacman");
		getContentPane().setBackground(Color.BLACK);
		setLayout(null);
		setIconImage(new ImageIcon(
		getClass().getResource("../Imagens/personagens/Pacman.png")).getImage());
		//setSize(1000, 562);
		setLocationRelativeTo(null);
		// -----FULL-SCREEN-----
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);// Decoration topside bar
		// ---------------------
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// Screen Size
		telaWidth = getWidth();
		telaHeight = getHeight();
		
        JPanel jogo = new Jogo();
        jogo.setVisible(false);
        add(jogo);
        jogo.setBounds(0, 0, telaWidth, telaHeight);
        //addTelaInicial();
        
		JPanel telaInicial = new TelaInicial(new GenericInterface() {
			@Override
			public void Metodo() {
				jogo.setVisible(true);
			}
		}, 
		new GenericInterface() {
			@Override
			public void Metodo() {
				// Close Game
				dispose();
			}
		});
        add(telaInicial);
        telaInicial.setBounds(0, 0, telaWidth, telaHeight);
        
	}
}
