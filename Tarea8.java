package unidad3;

/**
 * @author Alberto Medina
 * 
 * Id solicitando n�meros y sumando hasta que el n�mero introducido sea 0.
 * Cuando se introduzca el 0 no seguimos pidiendo m�s n�meros y mostramos todos los n�meros separados por coma.
 */

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		String resultado = "" ;
		do {	
		System.out.println("Introduzca n�meros");
		numero = sc.nextInt();
		suma += numero;
		resultado += ", " +numero;
		}while(numero !=0);
			
		System.out.println("La suma de los n�meros: "+ resultado.substring(2)+" es "+ suma);	
		
		sc.close();
	}

}
