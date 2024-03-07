package unidad3;

import java.util.Scanner;

/**
 * @author Alberto Medina
 * 
 *         Crear un m�todo Calcular con tres par�metros de entrada . Dos n�meros
 *         y un s�mbolo que indique la operaci�n. El m�todo mostrar� la
 *         operaci�n y el resultado.
 *
 */

public class tarea14 {

	public static void calcular(double num1, double num2, String signo) {

		switch (signo) {

		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;

		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;

		case "*":
			System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
			break;

		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		default:
			System.err.println("Introduzca una operaci�n v�lida");

		}
	}

	public static void main(String[] args) {
		String respuesta = "";

		do {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduzca el primer operando");
			double numero1 = sc.nextDouble();
			System.out.println("Introduzca el segundo operando");
			double numero2 = sc.nextDouble();
			System.out.println("Introduzca una operaci�n (+, -, *, /)");
			String signo = sc2.nextLine().trim();

			calcular(numero1, numero2, signo);
			
			System.out.println("�Desea realizar otra operaci�n (Si/No)?");
			respuesta = sc2.nextLine();

		} while (respuesta.equalsIgnoreCase("Si"));

	}

}
