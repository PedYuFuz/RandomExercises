package ex017;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class exercicio2 extends JFrame{
	boolean loop = true;
	
	public exercicio2() {
		String name="";
		do {
			name = JOptionPane.showInputDialog("Name: ");
			if(name.equals("") || name.equals(" ")) {
				loop=true;
				JOptionPane.showMessageDialog(null, "Please put a name!");
			}else {
				loop=false;
			}
		}while(loop);
		
		JOptionPane.showMessageDialog(null, "Your name is "+name);
	}
	
	public static void main(String[] args) {
		new exercicio2();
	}
}