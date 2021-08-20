package ex017;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Write a start number: ");
		int start = s.nextInt();
		
		System.out.print("Write a final number: ");
		int end = s.nextInt();
		
		int total=0;

		for(int i=start;i<end;i++) {
			System.out.print(i);
			total+=i;
		}
		System.out.print("\n"+total);
	}

}
