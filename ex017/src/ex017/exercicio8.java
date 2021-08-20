package ex017;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];
		int total=0;
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.print("Number: ");
			n[i] = scan.nextInt();
			total+=n[i];
		}
		System.out.println("The total is "+total+" and the average is "+total/5);
	}

}
