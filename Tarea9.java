package unidad3;

/**
 * @author Alberto Medina
 * 
 * Solicitar un número entero por teclado e indicar si es par o impar.
 * Seguir haciendo esto hasta que el usuario introduzca el valor -1, en ese caso mostraremos un mensaje y finalizaremos el programa.
 */

import java.util.Scanner;

public class Tarea9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero =0;
		while(numero !=-1) {	
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			if (numero%2 ==0 && numero!=-1) {
				System.out.println("El número introducido es par,");
			}else if (numero%2==1 && numero!=-1){
				System.out.println("El número introducido es impar");
			}
		}
		System.out.println("Has introducido el -1, fin.");
		
		sc.close();
	}

	}


