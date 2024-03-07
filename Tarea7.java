package unidad3;

/**
 * @author Alberto Medina
 * Hacer un programa que lea 10 números y que diga si se ha introducido algún número negativo.
 */

import java.util.Scanner;

public class Tarea7 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String negativos = "Números negativos introducidos: ";
	int lon = negativos.length(); //Guardo la longitud del String inicial donde voy a ir guardando los números negativos
	
	System.out.println("Introduzca 10 números enteros: ");
	for (int i=0; i<10; i++) {  //El bucle for va pidiendo los números
		int num = sc.nextInt();
		if (num<0) { // Si el número es negativo, lo concatena en el String de números ngativos, sino lo es continua el bucle.
			negativos += num + "; ";
		}
	}
	if (lon == negativos.length()) { //Comparo la longitud inicial del String de números negativos para comprobar si se ha añadido alguno.
		System.out.println("No has introducido ningún numero negativo.");//En caso de no haberse añadido imprimo este mensaje.
	}else {
	
	String resultado = negativos.substring(0, negativos.length()- 2); //Si se han añadido números negativos elimino el punto y coma finales
	System.out.println(resultado); 									//en una nueva variable String y la muestro.
	}
	
	sc.close();
	}
	
}
