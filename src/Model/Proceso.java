package Model;

public class Proceso extends Mensaje implements Runnable{

	@Override
	public void run() {
		
		imprimir();
	}

	
}
