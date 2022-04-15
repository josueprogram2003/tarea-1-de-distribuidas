package Tarea;

public class Leopardos extends Thread{

	String nombre;
	
	public Leopardos(String nombre) {
		this.nombre=nombre;
	}
	

	@Override
	public void run() {
		for (int i = 1; i <=20; i++) {
			System.out.println("El leopardo "+nombre +" recorrio: "+i + " KM");
		}
		System.out.println("Termino el Leopardo "+ nombre);
	}
	
	
	
}
