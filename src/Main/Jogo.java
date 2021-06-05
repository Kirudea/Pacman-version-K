package Main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Interfaces.GenericInterface;
import Objects.Painels;
import Objects.labelButton;

public class Jogo extends JFrame {
	// Screen Size
	public static int telaWidth;
	public static int telaHeight;

	public Jogo() {
		// Tela
		setTitle("Pacman");
		setIconImage(new ImageIcon(
		getClass().getResource("../Imagens/personagens/Pacman.png")).getImage());
		setSize(1000, 562);
		setLocationRelativeTo(null);
		// -----FULL-SCREEN-----
		//setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);// Decoration topside bar
		// ---------------------
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// Screen Size
		telaWidth = getWidth();
		telaHeight = getHeight();
		
		addTelaInicial();
	}

	private void addTelaInicial() {
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
        // 1366, 400 -> Width e Height Originais
        int H = (int) ((W * 200) / 683);

        // Img(Faixa) Resize
        faixaImg.setImage(faixaImg.getImage().getScaledInstance(W, H, 100));
        faixa.setIcon(faixaImg);
        TelInicial.add(faixa);
        faixa.setBounds((int) ((telaWidth - W) / 2), (int) (telaHeight * 0.05), W, H);

        // ----------- Painel's -----------
        JPanel commands = new Painels(0.4);
        commands.setVisible(false);
        TelInicial.add(commands);
        
        JPanel menu = new Painels(0.26);
        TelInicial.add(menu);

        // ------------ Menu ------------
        // Button Size
        W = (int) (telaWidth * 0.2);
        H = (int) (telaHeight * 0.07);

        // Button 1
        JLabel bttPLay = new labelButton("Jogar", new GenericInterface() {
			@Override
			public void Metodo() {
				TelInicial.setVisible(false);
				//Stop Animation
				// Play Game
			}
		});
        menu.add(bttPLay);
        bttPLay.setBounds((int) ((telaWidth - W) / 2), 0, W, H);

        // Button 2
        JLabel bttCommands = new labelButton("Comandos", new GenericInterface() {
            @Override
            public void Metodo() {
                menu.setVisible(false);
                commands.setVisible(true);
            }
        });
        menu.add(bttCommands);
        bttCommands.setBounds((int) ((telaWidth - W) / 2), H, W, H);

        // Button 3
        JLabel bttExit = new labelButton("Sair", new GenericInterface() {
			@Override
			public void Metodo() {
				// Close Game
				dispose();
			}
		});
        menu.add(bttExit);
        bttExit.setBounds((int) ((telaWidth - W) / 2), H * 2, W, H);

        // ----------- Commands -----------

        // Command 1
        JLabel CommUp = new labelButton("W", null);
        commands.add(CommUp);
        CommUp.setBounds((int) ((telaWidth - H) * 0.36), 0, H, H);

        // Command 2
        JLabel CommLeft = new labelButton("A", null);
        commands.add(CommLeft);
        CommLeft.setBounds(CommUp.getX() - H, H, H, H);

        // Command 3
        JLabel CommDown = new labelButton("S", null);
        commands.add(CommDown);
        CommDown.setBounds(CommUp.getX(), H, H, H);

        // Command 4
        JLabel CommRight = new labelButton("D", null);
        commands.add(CommRight);
        CommRight.setBounds(CommUp.getX() + H, H, H, H);

        // Command 4
        JLabel CommPause = new labelButton("Enter to Pause", null);
        commands.add(CommPause);
        CommPause.setBounds(CommRight.getX() + H * 5, H, H * 6, H);

        // Button 1
        JLabel bttBack = new labelButton("Voltar", new GenericInterface() {
            @Override
            public void Metodo() {
                commands.setVisible(false);
                menu.setVisible(true);
            }
        });
        commands.add(bttBack);
        bttBack.setBounds((telaWidth - W) / 2, CommDown.getY() + H * 3, W, H);
	}
}
