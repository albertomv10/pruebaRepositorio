package unidad3;

import java.util.Scanner;

/**
 * @author Alberto Medina
 * 
 *         Crear un m�todo en el que se pida ingresar por teclado su genero (M o
 *         F), para luego devolver un String con el texto que corresponda, var�n
 *         o mujer. En el m�todo main se invocar� al m�todo.
 */

public class Tarea22 {

	public static String genero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su g�nero: (M) � (F)");
		String r = "";
		boolean condicion = true;
		do {
			String g = sc.nextLine();
			if (g.equalsIgnoreCase("m")) {
				r = "Var�n";
				condicion = false;

			} else if (g.equalsIgnoreCase("f")) {
				r = "Mujer";
				condicion = false;

			} else {

				System.out.println("ERROR. Introduzca la letra (M) � (F)");

			}
		} while (condicion);
		return r;

	}

	public static void main(String[] args) {
		System.out.println(genero());

	}

}
