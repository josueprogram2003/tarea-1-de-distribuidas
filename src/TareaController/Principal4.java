package TareaController;

import Tarea.Leopardos;

public class Principal4 {
	
public static void main(String[] args) {
	Leopardos la = new Leopardos("L1");
	Leopardos le = new Leopardos("l2");
	Leopardos li = new Leopardos("l3");
	Leopardos lo = new Leopardos("l4");
	Leopardos lu = new Leopardos("l5");
	
	la.start();
	le.start();
	li.start();
	lo.start();
	lu.start();
}
}
