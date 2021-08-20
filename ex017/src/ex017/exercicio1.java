package ex017;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class exercicio1 extends JFrame{
	Scanner scan = new Scanner(System.in);
	double nota=-1;
	boolean loop = true;
	
	public exercicio1() {
		rep();
	}
	
	public void janela() {
		setResizable(false);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void rep() {
		double nota1 = 0;
		String nota2="";
		do {
			nota2 = JOptionPane.showInputDialog("Escreva a nota");
			nota1 = Double.parseDouble(nota2);
			if(nota1 < 0 || nota1 > 10) {
				loop = false;
			}else {
				nota = nota1;
				
				System.out.println("Sua nota foi de "+nota+" pontos.");
				loop=true;
			}
		}while(!loop);
		
		
	}
	
	public static void main(String[] args) {
		exercicio1 ex = new exercicio1();
		
	}
}
