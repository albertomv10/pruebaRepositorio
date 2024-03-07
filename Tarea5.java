package unidad3;

/**
 * @author: Alberto Medina
 * 
Crear una aplicaci�n que solicite n�meros hasta que la suma total de los n�meros introducidos sea 100 o mayor de 100.

Mostrar por consola la operaci�n que se ha realizado y su resultado.

Por ejemplo: 30 + 15 + 65 = 110
 */

import java.util.Scanner;

public class Tarea5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		
		System.out.println("Introduzca un numero entero:");
		int num = sc.nextInt();
		int total = num;
		String suma = "La suma es: ";
		
		if (num<100) {
			suma+= num;	
			
			while (total<100) {
				System.out.println("Introduzca otro n�mero entero");
				num = sc.nextInt();
				total= total+num;
				suma += "+"+num ;	
			}
			
			System.out.println(suma +" = "+total);
			System.out.println( "La suma es mayor que 100");
			
			
		}else {
			System.out.println("Su n�mero es mayor que 100");
		}
		
sc.close();
	}

}
