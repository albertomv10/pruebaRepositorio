package unidad3;

import java.util.Scanner;

/**
 * @author Alberto Medina
 * Eliminar los espacios de una frase pasada por consola por el usuario. 
 * Mostrar el resultado por consola.
 *
 */

public class Tarea21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase:");
		String frase = sc.nextLine();
		String frase2 = frase.replace(" ", "");
		System.out.println("Su frase sin espacios es: " + frase2);
		sc.close();
		
	}

}
