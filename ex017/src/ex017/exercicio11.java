package ex017;

import java.util.Scanner;

public class exercicio11 {
	Scanner s = new Scanner(System.in);
	int n=0;
	public exercicio11() {
		System.out.print("Number: ");
		n = s.nextInt();
		tab();
	}
	
	public void tab() {
		System.out.println("Tabuada de "+n);
		for(int i=1;i<=10;i++) {
			System.out.printf("\n%2d x %2d = %2d", n, i, n*i);
		}
	}

	public static void main(String[] args) {
		new exercicio11();
	}

}
