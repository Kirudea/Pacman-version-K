package Main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Interfaces.GenericInterface;
import Objects.Painels;
import Objects.labelButton;
import java.awt.Color;

public class TelaInicial extends JPanel{
	
    public TelaInicial(GenericInterface Evento1, GenericInterface Evento2) {
    	setLayout(null);
    	setOpaque(false);
		//JPanel TelInicial = new JPanel();
    	//add(TelInicial);
    	//setBounds(0, 0, Janela.telaWidth, Janela.telaHeight);
        //setBackground(Color.BLACK);

        // Img(Faixa)
        ImageIcon faixaImg = new ImageIcon(getClass().getResource("../Imagens/Faixa.png"));
        JLabel faixa = new JLabel();

        // Img(Faixa) Size
        int W = (int) (Janela.telaWidth * 0.9);
        // 1366, 400 -> Width e Height Originais
        int H = (int) ((W * 200) / 683);

        // Img(Faixa) Resize
        faixaImg.setImage(faixaImg.getImage().getScaledInstance(W, H, 100));
        faixa.setIcon(faixaImg);
        add(faixa);
        faixa.setBounds((int) ((Janela.telaWidth - W) / 2), (int) (Janela.telaHeight * 0.05), W, H);

        // ----------- Painel's -----------
        JPanel commands = new Painels(0.42);
        commands.setVisible(false);
        add(commands);
        
        JPanel menu = new Painels(0.42);
        add(menu);

        // ------------ Menu ------------
        // Button Size
        W = (int) (Janela.telaWidth * 0.2);
        H = (int) (Janela.telaHeight * 0.07);

        // Button 1
        JLabel bttPLay = new labelButton("Jogar", Evento1);
        menu.add(bttPLay);
        bttPLay.setBounds((int) ((Janela.telaWidth - W) / 2), menu.getHeight()-H*4, W, H);

        // Button 2
        JLabel bttCommands = new labelButton("Comandos", new GenericInterface() {
            @Override
            public void Metodo() {
                menu.setVisible(false);
                commands.setVisible(true);
            }
        });
        menu.add(bttCommands);
        bttCommands.setBounds((int) ((Janela.telaWidth - W) / 2), menu.getHeight()-H*3, W, H);

        // Button 3
        JLabel bttExit = new labelButton("Sair", Evento2);
        menu.add(bttExit);
        bttExit.setBounds((int) ((Janela.telaWidth - W) / 2), menu.getHeight()-H*2, W, H);

        // ----------- Commands -----------

        // Command 1
        JLabel CommUp = new labelButton("W", null);
        commands.add(CommUp);
        CommUp.setBounds((int) ((Janela.telaWidth - H) /2), commands.getHeight()-(int)(H*6.2), H, H);

        // Command 2
        JLabel CommLeft = new labelButton("A", null);
        commands.add(CommLeft);
        CommLeft.setBounds(CommUp.getX() - H, CommUp.getY()+H, H, H);

        // Command 3
        JLabel CommDown = new labelButton("S", null);
        commands.add(CommDown);
        CommDown.setBounds(CommUp.getX(), CommLeft.getY(), H, H);

        // Command 4
        JLabel CommRight = new labelButton("D", null);
        commands.add(CommRight);
        CommRight.setBounds(CommUp.getX() + H, CommLeft.getY(), H, H);

        // Command 4
        JLabel CommPause = new labelButton("Enter to Pause", null);
        commands.add(CommPause);
        CommPause.setBounds((Janela.telaWidth-H*6)/2, commands.getHeight()-H*4, H * 6, H);

        // Button 1
        JLabel bttBack = new labelButton("Voltar", new GenericInterface() {
            @Override
            public void Metodo() {
                commands.setVisible(false);
                menu.setVisible(true);
            }
        });
        commands.add(bttBack);
        bttBack.setBounds((Janela.telaWidth - W) / 2, commands.getHeight()-H*2, W, H);
	
        //return TelInicial;
    }

}
