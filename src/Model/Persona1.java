package Model;

public class Persona1 extends Thread{
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_GREEN = "\u001B[32m";
	String nombre;
	public Persona1(String n) {
		this.nombre =n;
	}
	
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(ANSI_YELLOW+nombre + " Termino Pan con Queso: " +i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
			
			if (i==3) {
				System.out.println(ANSI_GREEN + "Termino: " +nombre);
			}
		}
	}


	
}
