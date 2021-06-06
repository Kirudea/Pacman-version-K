package Main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Interfaces.GenericInterface;
import Objects.Painels;
import Objects.LabelButton;

public class HomeScreen extends Painels{
	
    public HomeScreen(double size_fluid) {
		super(size_fluid);
	}

	public void createHomeSreen(GenericInterface eventPlay, GenericInterface eventExit) {
        // Img(Faixa)
        ImageIcon faixaImg = new ImageIcon(getClass().getResource("../Images/Faixa.png"));
        JLabel faixa = new JLabel();

        // Img(Faixa) Size
        int W = (int) (Window.telaWidth * 0.9);
        // 1366, 400 -> Width e Height Originais
        int H = (int) ((W * 200) / 683);

        // Img(Faixa) Resize
        faixaImg.setImage(faixaImg.getImage().getScaledInstance(W, H, 100));
        faixa.setIcon(faixaImg);
        add(faixa);
        faixa.setBounds((int) ((Window.telaWidth - W) / 2), (int) (Window.telaHeight * 0.05), W, H);

        // ----------- Painel's -----------
        JPanel menu = new Painels(0.42);
        add(menu);
        
        JPanel commands = new Painels(0.42);
        commands.setVisible(false);
        add(commands);        

        // ------------ Menu ------------
        // Button Size
        W = (int) (Window.telaWidth * 0.2);
        H = (int) (Window.telaHeight * 0.07);

        // Button 1
        JLabel bttPLay = new LabelButton("Jogar", eventPlay);
        menu.add(bttPLay);
        bttPLay.setBounds((int) ((Window.telaWidth - W) / 2), menu.getHeight()-H*4, W, H);

        // Button 2
        JLabel bttCommands = new LabelButton("Comandos", new GenericInterface() {
            @Override
            public void Method() {
                menu.setVisible(false);
                commands.setVisible(true);
            }
        });
        menu.add(bttCommands);
        bttCommands.setBounds((int) ((Window.telaWidth - W) / 2), menu.getHeight()-H*3, W, H);

        // Button 3
        JLabel bttExit = new LabelButton("Sair", eventExit);
        menu.add(bttExit);
        bttExit.setBounds((int) ((Window.telaWidth - W) / 2), menu.getHeight()-H*2, W, H);

        // ----------- Commands -----------

        // Command 1
        JLabel CommUp = new LabelButton("W", null);
        commands.add(CommUp);
        CommUp.setBounds((int) ((Window.telaWidth - H) /2), commands.getHeight()-(int)(H*6.2), H, H);

        // Command 2
        JLabel CommLeft = new LabelButton("A", null);
        commands.add(CommLeft);
        CommLeft.setBounds(CommUp.getX() - H, CommUp.getY()+H, H, H);

        // Command 3
        JLabel CommDown = new LabelButton("S", null);
        commands.add(CommDown);
        CommDown.setBounds(CommUp.getX(), CommLeft.getY(), H, H);

        // Command 4
        JLabel CommRight = new LabelButton("D", null);
        commands.add(CommRight);
        CommRight.setBounds(CommUp.getX() + H, CommLeft.getY(), H, H);

        // Command 4
        JLabel CommPause = new LabelButton("Enter to Pause", null);
        commands.add(CommPause);
        CommPause.setBounds((Window.telaWidth-H*6)/2, commands.getHeight()-H*4, H * 6, H);

        // Button 1
        JLabel bttBack = new LabelButton("Voltar", new GenericInterface() {
            @Override
            public void Method() {
                commands.setVisible(false);
                menu.setVisible(true);
            }
        });
        commands.add(bttBack);
        bttBack.setBounds((Window.telaWidth - W) / 2, commands.getHeight()-H*2, W, H);
	
        //return TelInicial;
    }

}
