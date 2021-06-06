package Main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Interfaces.GenericInterface;

public class Window extends JFrame {
	// Screen Size
	public static int telaWidth;
	public static int telaHeight;

	public Window() {
		// Tela
		setTitle("Pacman");
		getContentPane().setBackground(Color.BLACK);
		setLayout(null);
		setIconImage(new ImageIcon(
		getClass().getResource("../Images/Characters/Pacman/Pacman.png")).getImage());
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
		
        HomeScreen homeScreen = new HomeScreen(1);
        add(homeScreen);
        
        Game game = new Game(1);
        
		homeScreen.createHomeSreen(new GenericInterface() {
			@Override
			public void Method() {
				homeScreen.setVisible(false);
				add(game);
				game.startGame();
			}
		}, 
		new GenericInterface() {
			@Override
			public void Method() {
				// Close Game
				dispose();
			}
		});
		
		game.createGame(null);
	}
}
