package ex020;

public class exercicio2 {

	public static void main(String[] args) {
		int[][] m= new int[10][10];
		int[] maior = {0,0};
		int[] menor = {10,10};
		
		for(int i=0;i<10;i++) {
			System.out.printf("\n");
			for(int j=0;j<10;j++) {
				m[i][j] = (int)Math.round(Math.random()*9);
				System.out.printf("%d ", m[i][j]);
				
				if(m[i][7]>maior[0]) {
					maior[0]=m[i][7];
				}if(m[i][7]<menor[0]) {
					menor[0]=m[i][7];
				}
				
				if(m[5][j]>maior[1]) {
					maior[1] = m[5][j];
				}if(m[5][j]<menor[1]) {
					menor[1]=m[5][j];
				}
			}
		}
		System.out.printf("\n\nLinha 5: maior -> %d menor -> %d\nColuna 7: maior -> %d menor -> %d", maior[1], menor[1], maior[0], menor[0]);

	}

}
