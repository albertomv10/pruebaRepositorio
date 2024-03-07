package unidad3;

/**
 * @author Alberto Medina
 * 
 * Realiza una aplicaci�n que nos pida un n�mero de ventas a introducir, despu�s nos pedir� tantas ventas por teclado como n�mero de ventas se hayan indicado. 
 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el n�mero de ventas: ");
		int num_ventas = sc.nextInt();
		double venta = 0;
		for (int i = 1; i <= num_ventas; i++) {
			System.out.print("Venta n�" + i + " (�):");
			venta += sc.nextDouble();
		}
		System.out.println("Venta total: " + venta + "�");
		sc.close();
	}

}
//  