package ex019;

public class exercicio25 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		
		for(int i=0;i<a.length;i++) {
			a[i]=(int) Math.round(Math.random()*1000);
			if(a[i]%2==0) {
				b[i]=1;
			}
			else {
				b[i]=0;
			}
			
			System.out.println(a[i]+" "+b[i]);
		}

	}

}
