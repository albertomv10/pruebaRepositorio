package unidad3;

import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = 0 ;
		
		while (nota<10) {
			
			System.out.println("Nota:");
			nota = sc.nextInt();
		}

		System.out.println("¡Congratulaciones, lo bordaste!");
		sc.close();
		
	}

}
