package unidad3;

/**
 * @author Alberto Medina
 
 Solicita un n�mero por teclado.

Una vez introducido el n�mero muestra un contador donde aparezcan todos los n�meros desde el 0 al n�mero indicado.

�Qu� pasa si el n�mero introducido es negativo? Vuestro programa debe funcionar con n�meros positivos y negativos.
 
 */

import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Introduzca un n�mero entero: ");
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
