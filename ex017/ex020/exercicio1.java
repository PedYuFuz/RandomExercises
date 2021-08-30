package ex020;

public class exercicio1 {

	public static void main(String[] args) {
		int[][] m = new int[4][4];
		int maior=0;
		int[] pos = new int[2];
		
		for(int i=0;i<4;i++) {
			System.out.printf("\n");
			for(int j=0;j<4;j++) {
				m[i][j]=(int)Math.round(Math.random()*9);
				System.out.printf("%d ", m[i][j]);
				if(m[i][j]>maior) {
					maior=m[i][j];
					pos[0]=i;
					pos[1]=j;
				}
			}
		}
		System.out.printf("\nO maior número é %d e se encontra na posição [%d] [%d]", maior, pos[0], pos[1]);
	}

}
