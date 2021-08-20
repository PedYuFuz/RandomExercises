package ex017;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean loop=true;
		int n=0;
		
		
		System.out.print("Numero de notas: ");
		n=s.nextInt();
		
		int[] notas =new int[n];		
		int total=0;

		for(int i=0;i<n;i++) {
			System.out.print("Nota: ");
			notas[i] = s.nextInt();
			total+=notas[i];
		}
		
		System.out.println("Média é "+total/n);
	}

}
