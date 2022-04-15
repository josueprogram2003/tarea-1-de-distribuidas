package Model;

public class Impares extends Thread {
	
int suma =0;
	
	@Override
	public void run() {
			for (int i = 1; i <= 10; i++) {
				if (i%2 !=0) {
					System.out.println(i);
					suma = suma+i;
				} else {
				}
			}
			
			System.out.println("La suma de Impares es :" +suma);
			
	}
}
