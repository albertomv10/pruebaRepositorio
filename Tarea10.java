package unidad3;

/**
 * @author Alberto Medina
 * Realizar un programa que tenga una contraseña y solicite al usuario que la introduzca pero que cada vez que falles, te reste un intento.
 * Tienes un máximo de 3 intentos.
 */

import java.util.Scanner;

public class Tarea10 {

	public static void main(String[] args) {
		final String CONTRASENA = "Croissant33";
		Scanner sc = new Scanner(System.in);
		int intentos = 3;
		System.out.println("Introduzca la contraseña, tiene " + intentos + " intentos:");
		String password = sc.nextLine();
		while (!CONTRASENA.equals(password) && intentos > 1) {
			intentos--;
			System.err.println("Contraseña incorrecta, le quedan " + intentos + " intentos.");
			password = sc.nextLine();
		}
		if (CONTRASENA.equals(password)) {
			System.out.println("Contraseña correcta, puede continuar.");
		} else {
			System.err.println("Se acabaron los intentos.");
		}
		sc.close();
	}

}
