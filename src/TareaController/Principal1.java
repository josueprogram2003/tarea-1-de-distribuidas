package TareaController;

import Tarea.Ascendente;
import Tarea.Descendente;

public class Principal1 {
	public static void main(String[] args) {
		Ascendente a = new Ascendente();
		Descendente d = new Descendente();
		
		a.start();
		d.start();
	}
}
