package unidad3;

import java.util.Scanner;

/**
 * 
 * @author Alberto Medina
 *
 * Crear un m�todo "dobleOtriple" que se le pase por par�metro un n�mero y eval�e si es par o impar.
 * Si es par el m�todo devolver� un entero con el doble de su valor y si es impar devolver� el triple de su valor.
 * En el m�todo main recogeremos por teclado un valor e invocaremos al m�todo "dobleOtriple". Se pintar� el valor devuelto por el m�todo.
 * Preguntar al usuario si quiere volver a introducir otro valor o no. El programa terminar� cuando el usuario responda "NO".
 */

public class Tarea24 {

	public static int dobleOtriple (int i) {
		int n;
		if (i%2 == 0) {
			System.out.println("El n�mero "+i+" es par");
			n = 2*i;
		} else {
			System.out.println("El n�mero "+i+" es impar");
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
			System.out.println("Introduzca un n�mero entero: ");
			int i = sc.nextInt();
			int x = dobleOtriple(i);
			System.out.println("El valor devuelto por el m�todo es: "+x);
			System.out.println("�Desea introducir otro n�mero? (Si/No)");
			String r = sc1.nextLine();
			if (r.equalsIgnoreCase("no")) {
				condicion = false;
				System.out.println("Fin del programa");
			}
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("ERROR. Valor introducido no v�lido.");
			sc.next();
		}
		}while(condicion);
		
		sc.close();
		sc1.close();
	}

}
