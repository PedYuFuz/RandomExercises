package ex019;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] age = new int[10];
		int maior=0,menor=0;
		int m=0,n=0;
		
		for(int i=0;i<10;i++) {
			age[i] = scan.nextInt();
		}
		for(int a:age) {
			if(a>maior) {
				maior=a;
			}
		}
		
		menor=maior;
		
		for(int a:age) {
			if(a<menor) {
				menor=a;
			}
		}
		
		//------------------------
		Arrays.sort(age);
		m=age[age.length-1];
		n=age[0];
		
		System.out.println("O maior é "+maior+" e o menor "+menor);
		System.out.println("O maior é "+m+" e o menor "+n);
			
		
	}

}
