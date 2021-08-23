package ex019;

public class exercicio24 {

	public static void main(String[] args) {
		boolean loop=true;
		String n1="", n2="";
		// TODO Auto-generated method stub
		while(loop) {
			int[] a = new int[10];
			n1="";
			n2="";
		
			for(int i=0;i<10;i++) {
				a[i] = (int) Math.round(Math.random()*9);
				n1+=String.valueOf(a[i]);
			}
			for(int i=9;i>=0;i--) {
				n2+=a[i];
			}
		
			if(n1.equals(n2)) {
				loop=false;
			}
		
		}
		
		System.out.println("Esta sequencia é para alguma coisa");
		System.out.println(n1);
		System.out.print(n2);
	}

}
