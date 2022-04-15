package Tarea;

public class Factorial extends Thread {
	int n;
	public Factorial(int num){
		this.n=num;
	}
	
	@Override
	public void run() {
		double aux =1;
		for (int i = 2; i <= n; i++) {
			aux*=i;
		}
		System.out.println("El factorial de :" + n + " es : " + aux );
	}
	
}
