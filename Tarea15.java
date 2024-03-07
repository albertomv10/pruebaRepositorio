package unidad3;

import java.util.Scanner;

/** Es la tarea 2 pero controlando las excepciones
Crear una aplicación que solicite dos valores numéricos y mostrar cual es el número mayor introducido 
o si son iguales (indicándolo).
**/
public class Tarea15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero:");
		boolean valido = true;
		
		do {
			try {
				int num1 = sc.nextInt();
				System.out.println("Introduzca otro número entero:");
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
				System.err.println("Error. Introduce un número entero.");
				sc.next();
			}
		} while (valido);
		
		
		sc.close();

	}

}
