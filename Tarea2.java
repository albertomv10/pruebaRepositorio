package unidad3;
import java.util.Scanner;

/**
 * 
 * @author Alberto Medina
 * 
 * Crear una aplicaci�n que solicite dos valores num�ricos y mostrar cual es el n�mero mayor introducido o si son iguales (indic�ndolo).
 *
 */

public class Tarea2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero:");
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
		
		sc.close();

	}

}
