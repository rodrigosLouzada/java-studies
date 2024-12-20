package util;

public class Calculator {

	public static final double PI = 3.14;
	
	public  double circunferencia(double raio) {
		
		return 2.0 * PI * raio ;
	}
	
	public  double vol (double raio) {
		return 4.0 * PI * raio * raio * raio /3.0;
	}
}
