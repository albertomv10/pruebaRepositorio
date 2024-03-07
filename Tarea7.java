package unidad3;

/**
 * @author Alberto Medina
 * Hacer un programa que lea 10 n�meros y que diga si se ha introducido alg�n n�mero negativo.
 */

import java.util.Scanner;

public class Tarea7 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String negativos = "N�meros negativos introducidos: ";
	int lon = negativos.length(); //Guardo la longitud del String inicial donde voy a ir guardando los n�meros negativos
	
	System.out.println("Introduzca 10 n�meros enteros: ");
	for (int i=0; i<10; i++) {  //El bucle for va pidiendo los n�meros
		int num = sc.nextInt();
		if (num<0) { // Si el n�mero es negativo, lo concatena en el String de n�meros ngativos, sino lo es continua el bucle.
			negativos += num + "; ";
		}
	}
	if (lon == negativos.length()) { //Comparo la longitud inicial del String de n�meros negativos para comprobar si se ha a�adido alguno.
		System.out.println("No has introducido ning�n numero negativo.");//En caso de no haberse a�adido imprimo este mensaje.
	}else {
	
	String resultado = negativos.substring(0, negativos.length()- 2); //Si se han a�adido n�meros negativos elimino el punto y coma finales
	System.out.println(resultado); 									//en una nueva variable String y la muestro.
	}
	
	sc.close();
	}
	
}
