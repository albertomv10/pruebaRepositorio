package unidad3;

/**
 * @author Alberto Medina
 * 
 * Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

import java.util.Scanner;

public class Tarea11_1 {
//Metodo que se llama obtenerTotalGanancias
//
	
	public static double obtenerTotalGanancias (int numventas) {
		
		double resultado = numventas*numventas;
		return resultado;
		
	}
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número de ventas: ");
		int num_ventas = sc.nextInt();
		double venta = 0;
		for (int i = 1; i <= num_ventas; i++) {
			System.out.print("Venta nº" + i + " (€):");
			venta += sc.nextDouble();
		}
		System.out.println("Venta total: " + venta + "€");
		sc.close();
	*/
	double resul = obtenerTotalGanancias(3);
	System.out.println(resul);
	}

}
