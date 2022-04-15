package Model;

public class Principal2 {
	
	public static void main(String[] args) throws InterruptedException {
		Pares par  = new Pares();
		Impares impar = new Impares();
		
		par.start();
		Thread.sleep(2000);
		impar.start();
	}
}
