package LIXEIRA;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

public class Jogo extends JFrame {
	// Monitor
	static int telaWidth;
	static int telaHeight;

	ImageIcon favIcon = new ImageIcon(getClass().getResource("Imagens/personagens/Pacman.png"));

	// Itens Tela Inicial
	static JPanel TelInicial = new JPanel();
	ImageIcon faixaImg = new ImageIcon(getClass().getResource("Imagens/Faixa.png"));
	JLabel faixa = new JLabel();

	// Itens Jogo
	static JPanel Jogo;
	ImageIcon imgMapa = new ImageIcon(getClass().getResource("Imagens/Mapa.png"));
	JLabel mapa;

	//Itens Records
	static JPanel Records;
	
	public Jogo() {
		// Tela
		setTitle("Pacman");
		setIconImage(favIcon.getImage());
		setLocationRelativeTo(null);
		// -----FULL-SCREEN-----
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);// Decoration topside bar
		// ---------------------
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		setVisible(true);

		telaWidth = getWidth();
		telaHeight = getHeight();

		// Tela Inicial
		TelInicial.setBackground(Color.BLACK);
		TelInicial.setBounds(0, 0, telaWidth, telaHeight);
		TelInicial.setLayout(null);
		getContentPane().add(TelInicial);
		
		int W = (int) (telaWidth * 0.9);
		int H = (int) ((W * 100) / 465);

		faixaImg.setImage(faixaImg.getImage().getScaledInstance(W, H, 100));

		TelInicial.add(faixa);
		faixa.setIcon(faixaImg);
		faixa.setBounds((int) (telaWidth * 0.04), (int) (telaHeight * 0.05), W, H);

		// Animation
		addAnimation();

		//Buttons
		addButtons();

		// Game
		addGame();
	}
	
	public void addAnimation() {
		
	}
	
	public void addButtons() {	
		// ------- Buttons Info -------
		int W = (int) (telaWidth * 0.18);
		int H = (int) (telaHeight * 0.09);
		int posX = (int) ((telaWidth - H)*0.3);

		//--------- Painel's ---------
		Painel Menu = new Painel((int)(telaHeight*0.35));
		Painel Commands = new Painel((int)(telaHeight*0.44));

		// --------- Commands ---------
		Commands.setVisible(false);
		TelInicial.add(Commands);
		
		//Commands
		JLabel CommUp = new Button("W");
		JLabel CommRight = new Button("D");
		JLabel CommDown = new Button("S");
		JLabel CommLeft = new Button("A");
		JLabel CommStart = new Button("Enter to Pause");
		
		Commands.add(CommUp);
		CommUp.setBounds(posX, 0, H, H);
		
		Commands.add(CommLeft);
		CommLeft.setBounds(posX-H, H, H, H);
		
		Commands.add(CommDown);
		CommDown.setBounds(posX, H, H, H);
		
		Commands.add(CommRight);
		CommRight.setBounds(posX+H, H, H, H);
		
		Commands.add(CommStart);
		CommStart.setBounds(telaWidth-H*3-posX, H, H*5, H);
		
		posX = (int) ((telaWidth - W) / 2);
		
		// Button 1
		JLabel bttBack = new Button("Voltar");
		Commands.add(bttBack);
		bttBack.setBounds(posX, CommDown.getY()+H*2, W, H);
		
		bttBack.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				Commands.setVisible(false);
				Menu.setVisible(true);
			}
		});
		
		// ----------- Menu -----------
		TelInicial.add(Menu);
			
		// Button 1
		JLabel bttPlay = new Button("Jogar");
		Menu.add(bttPlay);
		bttPlay.setBounds(posX, 0, W, H);
		
		bttPlay.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				//Play Game
			}
		});
		
		// Button 2
		JLabel bttCommands = new Button("Comandos");
		Menu.add(bttCommands);
		bttCommands.setBounds(posX, bttPlay.getY() + H, W, H);
		
		bttCommands.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.setVisible(false);
				Commands.setVisible(true);
			}
		});
		
		// Button 3 
		JLabel bttExit = new Button("Sair");
		Menu.add(bttExit);
		bttExit.setBounds(posX, bttCommands.getY() + H, W, H);
		
		bttExit.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				//Close Window
				dispose();
			}
		});
	}
	
	public void addGame() {
		
	}
}
