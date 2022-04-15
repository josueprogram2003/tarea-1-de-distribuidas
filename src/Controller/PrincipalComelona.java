package Controller;

import Model.Persona1;

public class PrincipalComelona {
	public static void main(String[] args) {
		
		Persona1 p1 = new Persona1("Josue");
		Persona1 p2 = new Persona1("Roberto");
		Persona1 p3 = new Persona1("Lia");
		Persona1 p4 = new Persona1("Mia");
		Persona1 p5 = new Persona1("Irene");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
