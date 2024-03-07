package unidad3;

/**
* Realizar un programa que lea un número de teclado pedido al usuario y muestre la tabla de multiplicar de dicho número.
*  MEJORA:
* Utilizar el mismo código pero dando la posibilidad al usuario de solicitar un nuevo número y mostrar de esta manera varias tablas de multiplicar. Haced esto hasta que el usuario introduzca el valor -1.
 */

import java.util.Scanner;

public class tarea12 {
	
	public static String tablaMultiplicar () {

		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de tablas de multiplicar");
		int tabla = 0;
		do {
		System.out.println("Introduzca la tabla que desea calcular:");
		tabla = sc.nextInt();
		if (tabla >=0 && tabla<=10) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(tabla+"x"+i+"="+i*tabla);
			}
		}else {
			System.err.println("Tabla no válida.");
		}
		}while(tabla != -1);
		sc.close();
		return "";
		
	}

	public static void main(String[] args) {

	
 tablaMultiplicar();
}
}