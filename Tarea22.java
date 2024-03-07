package unidad3;

import java.util.Scanner;

/**
 * @author Alberto Medina
 * 
 *         Crear un método en el que se pida ingresar por teclado su genero (M o
 *         F), para luego devolver un String con el texto que corresponda, varón
 *         o mujer. En el método main se invocará al método.
 */

public class Tarea22 {

	public static String genero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su género: (M) ó (F)");
		String r = "";
		boolean condicion = true;
		do {
			String g = sc.nextLine();
			if (g.equalsIgnoreCase("m")) {
				r = "Varón";
				condicion = false;

			} else if (g.equalsIgnoreCase("f")) {
				r = "Mujer";
				condicion = false;

			} else {

				System.out.println("ERROR. Introduzca la letra (M) ó (F)");

			}
		} while (condicion);
		return r;

	}

	public static void main(String[] args) {
		System.out.println(genero());

	}

}
