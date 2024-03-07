package unidad3;

/**
 * @author Alberto Medina
 * 
 * Id solicitando números y sumando hasta que el número introducido sea 0.
 * Cuando se introduzca el 0 no seguimos pidiendo más números y mostramos todos los números separados por coma.
 */

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		String resultado = "" ;
		do {	
		System.out.println("Introduzca números");
		numero = sc.nextInt();
		suma += numero;
		resultado += ", " +numero;
		}while(numero !=0);
			
		System.out.println("La suma de los números: "+ resultado.substring(2)+" es "+ suma);	
		
		sc.close();
	}

}
