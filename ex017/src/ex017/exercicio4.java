package ex017;

import java.util.Scanner;

public class exercicio4 {
	int pop1=80000;
	int pop2=200000;
	
	int c1=(pop1*5/100); //2400
	int c2=(pop2*3/200); //3000
	
	int years = 0;
	
	public exercicio4() {
		/*Scanner s = new Scanner(System.in);
		System.out.print("Population: ");
		pop1 = s.nextInt();		
		System.out.print("Population of the other city: ");
		pop2 = s.nextInt();*/
		
		System.out.print(years + " " + pop1 + " " + pop2);
		
		while(pop1!=pop2) {
			
			years++;
			pop1+=c1;
			pop2+=c2;
			System.out.print(years + " " + pop1 + " " + pop2);
			
		}
		System.out.println("\nThe number of years to be igual is "+ years);
	}

	public static void main(String[] args) {
		new exercicio4();
	}

}
