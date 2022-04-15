package Model;

public class Principal3 {
	public static void main(String[] args) {
		Conejo c = new Conejo("Conejo");
		Tortuga t = new Tortuga("Tortuga");
		Venado v = new Venado("Venado");
		
		c.start();
		t.start();
		v.start();
	}
}
