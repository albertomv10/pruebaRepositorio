package unidad3;

/**
 * @author Alberto Medina
 
 Solicita un número por teclado.

Una vez introducido el número muestra un contador donde aparezcan todos los números desde el 0 al número indicado.

¿Qué pasa si el número introducido es negativo? Vuestro programa debe funcionar con números positivos y negativos.
 
 */

import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Introduzca un número entero: ");
		int num = sc.nextInt();
		int n = 0;
		if (num>0) {
			while(n<=num) {
			System.out.println(n);
			n++;
		}
		}else {
			while(n>=num) {
				System.out.println(n);
				n--;
			}	
		}
sc.close();
	}

}
