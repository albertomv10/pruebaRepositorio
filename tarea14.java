package unidad3;

import java.util.Scanner;

/**
 * @author Alberto Medina
 * 
 *         Crear un método Calcular con tres parámetros de entrada . Dos números
 *         y un símbolo que indique la operación. El método mostrará la
 *         operación y el resultado.
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
			System.err.println("Introduzca una operación válida");

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
			System.out.println("Introduzca una operación (+, -, *, /)");
			String signo = sc2.nextLine().trim();

			calcular(numero1, numero2, signo);
			
			System.out.println("¿Desea realizar otra operación (Si/No)?");
			respuesta = sc2.nextLine();

		} while (respuesta.equalsIgnoreCase("Si"));

	}

}
