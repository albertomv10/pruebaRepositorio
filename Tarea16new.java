package unidad3;

import java.util.Scanner;

public class Tarea16new {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean validacion = true;

		do {
			System.out.println("Introduzca una palabra:");
			String palabra = sc.nextLine();
			int longitud = palabra.length();
			if (palabra.equalsIgnoreCase("FIN")) {
				validacion = false;
			} else {
				for (int i = 0; i < longitud; i++) {
					System.out.println("Letra " + (i + 1) + ": " + palabra.substring(i, i + 1));
				}
			}
		} while (validacion);
		sc.close();
	}
}

