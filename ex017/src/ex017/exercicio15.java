package ex017;

public class exercicio15 {
	public static void main(String[] args) {
		int nA=0;
		int nB=0;
		int nP=1;
		for(int i=0;i<20;i++) {
			while(nP<500) {
				System.out.print(nP+", ");
				nB=nP;
				nP=nA+nP;	
				nA=nB;
			}
		}
	}
}
