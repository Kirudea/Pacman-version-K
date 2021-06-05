package Main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Interfaces.GenericInterface;
import Objects.Button;
import Objects.Painels;

public class Jogo extends JFrame {
	// Screen Size
	public static int telaWidth;
	public static int telaHeight;

	public Jogo() {
		// Tela
		setTitle("Pacman");
		setIconImage(new ImageIcon(
		getClass().getResource("../Imagens/personagens/Pacman.png")).getImage());
		setLocationRelativeTo(null);
		// -----FULL-SCREEN-----
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);// Decoration topside bar
		// ---------------------
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		addTelaInicial();
	}

	private void addTelaInicial() {
		// Screen Size
		telaWidth = getWidth();
		telaHeight = getHeight();

		JPanel TelInicial = new JPanel();
		add(TelInicial);
		TelInicial.setLayout(null);
		TelInicial.setBounds(0, 0, telaWidth, telaHeight);
		TelInicial.setBackground(Color.BLACK);
		
		// Img(Faixa)
		ImageIcon faixaImg = new ImageIcon(getClass().getResource("../Imagens/Faixa.png"));
		JLabel faixa = new JLabel();
		
		// Img(Faixa) Size
		int W = (int) (telaWidth * 0.9);
		int H = (int) ((W * 100) / 465);

		// Img(Faixa) Resize
		faixaImg.setImage(faixaImg.getImage().getScaledInstance(W, H, 100));
		faixa.setIcon(faixaImg);
		TelInicial.add(faixa);
		faixa.setBounds((int) ((telaWidth - W) / 2), (int) (telaHeight * 0.05), W, H);
		
		// ----------- Painel's -----------
		JPanel commands = new Painels(0.25);
		commands.setVisible(false);
		TelInicial.add(commands);
		
		JPanel menu = new Painels(0.25);
		TelInicial.add(menu);

		// ------------ Menu ------------
		// Button Size
		W = (int) (telaWidth * 0.2);
		H = (int) (telaHeight * 0.07);
		
		// Button 1
		JLabel bttPLay = new Button("Jogar", new GenericInterface() {
			@Override
			public void Metodo() {
				// Play Game
			}
		});
		menu.add(bttPLay);
		bttPLay.setBounds((int) ((telaWidth - W) / 2), 0, W, H);

		// Button 2
		JLabel bttCommands = new Button("Comandos", new GenericInterface() {
			@Override
			public void Metodo() {
				menu.setVisible(false);
				commands.setVisible(true);
			}
		});
		menu.add(bttCommands);
		bttCommands.setBounds((int) ((telaWidth - W) / 2), bttPLay.getY() + H, W, H);
		
		// Button 3
		JLabel bttExit = new Button("Sair", new GenericInterface() {	
			@Override
			public void Metodo() {
				// Close Game
				dispose();
			}
		});
		menu.add(bttExit);
		bttExit.setBounds((int) ((telaWidth - W) / 2), bttCommands.getY() + H, W, H);
		
		// ----------- Commands -----------		
		// Button 1
		JLabel bttBack = new Button("Voltar", new GenericInterface() {
			@Override
			public void Metodo() {
				commands.setVisible(false);
				menu.setVisible(true);
			}
		});
		commands.add(bttBack);
		bttBack.setBounds((int) ((telaWidth - W) / 2), 0/*posY do "S" + H*2*/, W, H);
	}
}
