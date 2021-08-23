package ex019;

public class exercicio27 {

	public static void main(String[] args) {
		int[] a = new int[10];
		char[] b = new char[10];
		
		for(int i=0;i<10;i++) {
			a[i]=(int)Math.round(Math.random()*11);
			if(a[i]<7) {
				b[i]='a';
			}else if(a[i]==7) {
				b[i]='b';
			}else if(a[i]>7&&a[i]<10) {
				b[i]='c';
			}else if(a[i]==10) {
				b[i]='d';
			}else if(a[i]>10) {
				b[i]='e';
			}
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\n");
		
		for(char c:b) {
			System.out.print(c+" ");
		}
	}

}
