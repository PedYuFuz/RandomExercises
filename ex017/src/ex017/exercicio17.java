package ex017;

import java.util.Scanner;

public class exercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Number: ");
		int n = s.nextInt();
		int total = 1;
		
		for(int i=n;i>0;i--) {
			total*=i;
		}
		
		System.out.println(total);
	}
}
