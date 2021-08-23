package ex019;

public class exercicio22 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int num1=0,porc=0;

		for(int i=0;i<10;i++) {
			a[i] = (int)Math.round(Math.random()*1);
			if(a[i]==1) {
				num1++;
			}
			//System.out.print(a[i]+" ");
		}
		double porcD = ((double)num1/10)*100;
		porc = (int) porcD;
		System.out.println("A porcentagem é de "+porc+"%");
	}

}
