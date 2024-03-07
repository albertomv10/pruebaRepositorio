package unidad3;

/**
 * @author Alberto Medina
 * Realizar un programa que lea 5 notas de alumnos por teclado
 * y que al final me diga cuántos aprobados y cuántos suspensos hay.
 */

import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TOTALNOTAS = 5;
		int suspenso = 0;
		for (int i = 0; i < TOTALNOTAS; i++) {
			System.out.println("Introduzca una nota:");
			double nota = sc.nextDouble();

			if (nota < 5 && nota >= 0) {
				suspenso++;
			} else if (nota > 10 || nota < 0) {
				System.out.println("Nota no válida.");
				i--;
			}
		}
		System.out.println("Hay " + suspenso + " suspensos y " + (TOTALNOTAS - suspenso) + " aprobados.");
		sc.close();
	}

}
