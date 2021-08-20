package ex017;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		boolean loop=false;
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.print("Number: ");
		int n = s.nextInt();
		System.out.print("Expoente: ");
		int n2 = s.nextInt();
		
		int number=n;
		for(int i=2;i<=n2;i++) {
			number*=n;
		}
		if(n2==0) {
			number=1;
		}
		System.out.println("The result is "+number);
		
		System.out.print("Wanna do another operation? ");
		char res = s.next().charAt(0);
		if(res=='Y'||res=='y')
			loop=true;
		else
			loop=false;
		}while(loop);
	}

}
