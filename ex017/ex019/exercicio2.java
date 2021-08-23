package ex019;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] age = new int[10];
		int old=0;
		
		for(int i=0;i<10;i++) {
			age[i] = scan.nextInt();
		}
		for(int a:age) {
			if(a>35) {
				old++;
			}
		}
		System.out.println(old);
	}

}
