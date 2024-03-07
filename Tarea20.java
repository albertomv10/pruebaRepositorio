package unidad3;

import java.util.Scanner;

public class Tarea20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		boolean condicion = true;
		do {
		try {
			System.out.println("Introduzca un número para adivinar");
			num1 = sc.nextInt();	
			condicion = false;
		} catch (Exception e) {
			System.out.println("ERROR. Introduzca un número por favor:");
			sc.next();
		}
		}while(condicion);
		
		boolean condicion2 = true;
		do {
			try {
				System.out.println("Intente adivinar el número introducido anteriormente:");
				num2 = sc.nextInt();	
				if (num2>num1) {
					System.out.println("Su número es mayor");
				} else if (num2<num1) {
					System.out.println("Su número es menor");
				}else {
					System.out.println("Enhorabuena ha adivinado el número.");
					condicion2 = false;
				}
			} catch (Exception e) {
				System.out.println("ERROR. Introduzca un número por favor:");
				sc.next();
			}
		}while(condicion2);
		

		
		
	}

}
