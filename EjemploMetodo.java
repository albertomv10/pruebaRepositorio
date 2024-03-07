package unidad3;

import java.util.Scanner;

public class EjemploMetodo {

	public static String leer(String mensaje) {
		Scanner sc = new Scanner(System.in);

		System.out.println(mensaje);
		String respuesta = sc.nextLine();
		
		return respuesta;	
	}

	public static void main(String[] args) {

		String nombre = leer("Introduzca su nombre");
		String apellido = leer("Introduzca su apellido");
		String oficio = leer("Introduzca su oficio");
	
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(oficio);
	}

}
