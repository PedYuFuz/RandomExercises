package ex019;

public class exercicio4 {
	
	public static void main(String[] args) {
		double[] nota1= new double[3];
		double[] nota2= new double[3];
		
		double[] total= new double[3];
		
		nota1[0] = 10;
		nota1[1] = 3.5;
		nota1[2] = 6;
		
		nota2[0] = 9;
		nota2[1] = 5;
		nota2[2] = 9;
		
		total[0]=nota1[0]+nota2[0];
		total[1]=nota1[1]+nota2[1];
		total[2]=nota1[2]+nota2[2];
		
		System.out.println(total[0]+" "+total[1]+" "+total[2]);
	}
}
