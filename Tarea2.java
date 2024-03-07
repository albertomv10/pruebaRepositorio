package unidad3;
import java.util.Scanner;

/**
 * 
 * @author Alberto Medina
 * 
 * Crear una aplicación que solicite dos valores numéricos y mostrar cual es el número mayor introducido o si son iguales (indicándolo).
 *
 */

public class Tarea2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero:");
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
		
		sc.close();

	}

}
