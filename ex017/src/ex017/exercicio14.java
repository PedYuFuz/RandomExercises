package ex017;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] n = new int[10];
		int even = 0; //par
		int odd = 0; //impar
		
		for(int i=0;i<n.length;i++) {
			System.out.print("Number: ");
			n[i] = s.nextInt();
			
			if(n[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.printf("\nEven: %d\nOdd: %d\n", even, odd);

	}

}
