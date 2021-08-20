package ex017;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class exercicio3 extends JFrame{
	boolean loop = true;
	
	public exercicio3() {
		String name = ""; int age = -1; double salary = 0; char gen = ' '; char c = ' ';
		
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(5,2));
		
			JTextField xName = new JTextField();
			JTextField xAge = new JTextField();
			JTextField xSalary = new JTextField();
			JTextField xGen = new JTextField();
			JTextField xC = new JTextField();
			
			Object[] m = {
					"Name:",xName,"Age:",xAge,"Salary:",xSalary,"Genrer:",xGen,"Civil Status:",xC
			};
			
			do{
				int res = JOptionPane.showConfirmDialog(null, m, "Write", JOptionPane.OK_CANCEL_OPTION);
				
				if(res == JOptionPane.OK_OPTION) {
					name = xName.getText();
					age = Integer.parseInt(xAge.getText());
					salary = Double.parseDouble(xSalary.getText());
					gen = xGen.getText().charAt(0);
					c = xC.getText().charAt(0);
					
					if(name.length()>3 && (age>0&&age<150) && salary>0 && (gen=='F'||gen=='f'||gen=='m'||gen=='M') && (c=='s'||c=='c'||c=='v'||c=='d'||c=='S'||c=='C'||c=='V'||c=='D')) {
						loop=false;
						System.out.println("Nome: "+name+"\nAge: "+age);					
					}else {
						loop=true;
					}
				}
				
				if(res==JOptionPane.CANCEL_OPTION || res==JOptionPane.CLOSED_OPTION) {
					loop=false;
				}
			}while(loop);
	}
	
	public static void main(String[] args) {
		new exercicio3();
	}
}