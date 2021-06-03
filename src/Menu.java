import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Menu extends JFrame {   
    ImageIcon imgMapa = new ImageIcon(getClass().getResource("Imagens/Mapa.png"));
    JLabel mapa = new JLabel(imgMapa);
    ImageIcon favIcon = new ImageIcon(getClass().getResource("Imagens/personagens/Pacman.png"));
    
    public static void main(String[] args) {
        new Menu();
    } 
    public Menu() {
        //Tela
        setTitle("Pacman");
        setIconImage(favIcon.getImage());
        setSize(680, 740);
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        //Elementos
        mapa.setBounds(95, 95, 100, 100);
        add(mapa);
        //tela();
        setVisible(true); 

    }
    
    public void tela(){

    }
}
