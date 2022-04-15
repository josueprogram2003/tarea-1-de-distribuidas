package Controller;

public class Hilo1  extends Thread{
	
	private String mensaje;
	private int n;

	public Hilo1(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	@Override
	public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(mensaje +" - "+i);
			}
			System.out.println("El proceso a finalinzado: " + this.getName());
	}
	
	public void operacion(int n) {
		if (n==1) {
			
		}else if (n==2) {
			
		}
	}
	
}
