package unidad3;

import java.util.Scanner;

/**
 * 
 * @author Alberto Medina
 *
 * Crear un método "dobleOtriple" que se le pase por parámetro un número y evalúe si es par o impar.
 * Si es par el método devolverá un entero con el doble de su valor y si es impar devolverá el triple de su valor.
 * En el método main recogeremos por teclado un valor e invocaremos al método "dobleOtriple". Se pintará el valor devuelto por el método.
 * Preguntar al usuario si quiere volver a introducir otro valor o no. El programa terminará cuando el usuario responda "NO".
 */

public class Tarea24 {

	public static int dobleOtriple (int i) {
		int n;
		if (i%2 == 0) {
			System.out.println("El número "+i+" es par");
			n = 2*i;
		} else {
			System.out.println("El número "+i+" es impar");
			n = 3*i;
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		
		boolean condicion = true;
		do {
		try {
			System.out.println("Introduzca un número entero: ");
			int i = sc.nextInt();
			int x = dobleOtriple(i);
			System.out.println("El valor devuelto por el método es: "+x);
			System.out.println("¿Desea introducir otro número? (Si/No)");
			String r = sc1.nextLine();
			if (r.equalsIgnoreCase("no")) {
				condicion = false;
				System.out.println("Fin del programa");
			}
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("ERROR. Valor introducido no válido.");
			sc.next();
		}
		}while(condicion);
		
		sc.close();
		sc1.close();
	}

}
