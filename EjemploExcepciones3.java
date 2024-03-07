package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valido = true;
		do {
			try {
				System.out.println("introduzca un numero: ");
				int num = sc.nextInt();
				System.out.println("Numero: "+num);	
				valido = false;
			} catch (InputMismatchException ex) {
				System.err.println("Error. Introduce un número.");
				sc.next();
			}
		} while (valido);
		sc.close();
	
	
	
	
	try {

		
	} catch (Exception e) {
		
		
		
	}
	
	
	
	
	
	
	
	
	}

}
