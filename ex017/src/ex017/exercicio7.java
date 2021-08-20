package ex017;

import java.util.Scanner;

public class exercicio7 {
	

	public static void main(String[] args) {
		int[] n = new int[5];
		int maior = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<n.length;i++) {
			System.out.print("Number: ");
			n[i] = s.nextInt();
		}
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>maior) {
				maior=n[i];
			}
		}
		System.out.println("O maior numero foi "+ maior);

	}

}
