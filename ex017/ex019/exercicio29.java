package ex019;

public class exercicio29 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		
		for(int i=0;i<20;i++) {
			if(i<=9) {
				a[i] = (int)Math.round(Math.random()*10);
				b[i] = (int)Math.round(Math.random()*10);
				c[i]=a[i];
			}
			
			if(i>9) {
				c[i]=b[(i-10)];
			}
		}
		for(int k:c) {
			System.out.print(k+" ");
		}
	}

}
