package unidad3;

import java.util.Scanner;

/** Es la tarea 2 pero controlando las excepciones
Crear una aplicaci�n que solicite dos valores num�ricos y mostrar cual es el n�mero mayor introducido 
o si son iguales (indic�ndolo).
**/
public class Tarea15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero:");
		boolean valido = true;
		
		do {
			try {
				int num1 = sc.nextInt();
				System.out.println("Introduzca otro n�mero entero:");
				int num2 = sc.nextInt();
				
				if (num1 < num2) {
					System.out.println(num2 + " es mayor que "+ num1);
				}else if (num1 > num2) {
					System.out.println(num1+" es mayor que "+num2);
				}else {
					System.out.println(num1+" es igual que "+num2);
				}
				valido = false;
			} catch (Exception ex) {
				System.err.println("Error. Introduce un n�mero entero.");
				sc.next();
			}
		} while (valido);
		
		
		sc.close();

	}

}
