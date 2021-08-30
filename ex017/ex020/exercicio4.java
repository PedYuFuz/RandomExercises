package ex020;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//perguntar dia dps hora e dai alterar no calendario
		Scanner scan = new Scanner(System.in);		
		String[][] time = new String[30][24];
		int day=0,hour=0;
		char a=' '; char b=' ';
		boolean loop=true;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				
			}
		}
		
		while(loop) {
			System.out.printf("Wanna add some appointment? ");
			b=scan.next().charAt(0);
			if(b=='y'||b=='Y') {
				System.out.printf("Day: ");
				day=scan.nextInt()-1;
				System.out.printf("\nHour: ");
				hour=scan.nextInt()-1;
				
				System.out.printf("\n%s", time[day][hour]);
			}System.out.printf("Wanna add another appointment? ");
			b=scan.next().charAt(0);
			if(b=='y'||b=='Y') {
				System.out.printf("Day: ");
				day=scan.nextInt()-1;
				System.out.printf("\nHour: ");
				hour=scan.nextInt()-1;
				
				System.out.printf("\n%s", time[day][hour]);
			}
			/*
			;*/
			
			System.out.printf("Do you want to see some appointment? ");
			a=scan.next().charAt(0);
			if(a=='y'||a=='Y') {
				System.out.printf("Day: ");
				day=scan.nextInt()+1;
				System.out.printf("\nHour: ");
				hour=scan.nextInt()+1;
				
				System.out.printf("\n%s", time[day][hour]);
			}System.out.printf("Wanna see another appointment? ");
			b=scan.next().charAt(0);
			if(b=='y'||b=='Y') {
				System.out.printf("Day: ");
				day=scan.nextInt()+1;
				System.out.printf("\nHour: ");
				hour=scan.nextInt()+1;
				
				System.out.printf("\n%s", time[day][hour]);
			}else {
				loop=false;
			}
		}

	}

}
