package Model;

import Controller.Hilo1;

public class Principal1 {
	
	public static void main(String[] args) {
		Hilo1 h1 = new Hilo1("Hola 1");
		Hilo1 h2 = new Hilo1("Hola 2");
		h1.start();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.yield();
		h2.start();
		
		
		System.out.println("Siguiendo despues del star");
	}
	
}
