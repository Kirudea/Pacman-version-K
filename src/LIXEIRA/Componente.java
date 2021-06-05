package LIXEIRA;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Componente<E> {
	JButton btt = new JButton(); 
	JLabel jl = new JLabel();
	JComponent jc;
	
	public Componente(byte type) {
		if(type == 0) {
			jc = btt;
		}else {
			jc = jl;
		}		

		jc.setForeground(jc.getForeground().WHITE);
		jc.setBackground(jc.getBackground().BLACK);
		jc.setFont(new Font("Dialog", 1, (int) (Jogo.telaHeight * 0.06)));
	}
	
	public E getComponente() {	
		return (E) jc;
	}
	
	
}






