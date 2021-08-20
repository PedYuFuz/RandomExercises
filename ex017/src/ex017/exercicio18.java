package ex017;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Number: ");
		int n=s.nextInt();
		int a=0;
		ArrayList<Integer> inte = new ArrayList<Integer>();
		
		for(int i=2;i<100;i++) {
			if(n%i==0 && i!=n) {
				a++;
				inte.add(i);
			}
		}
		
		if(a==0) {
			System.out.println("Esse número é primo!");
		}else {
			System.out.printf("Os numero que dividem são ");
			for(int na:inte) {
				System.out.print(na+" ");
			}
		}
	}

}
