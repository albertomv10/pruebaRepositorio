package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pedir una hora de la forma hora, minutos y segundos, y
 mostrar la hora en el segundo siguiente. Importante control de
 errores. Resolver creando un metodo.
 * @author Alberto Medina 
 * @version 2.2			
 */

public class Tarea19 {

	public static void main(String[] args) {

		System.out.println("Programa para sumar un segundo a una hora introducida por el usuario. (hh:mm:ss) \n");

		boolean condicion = true;
		boolean condicion2 = true;

		do {
			String hora = recogedato(23, "horas");
			String minuto = recogedato(59, "minutos");
			String segundo = recogedato(59, "segundos");
			String reloj = hora+":"+minuto+":"+segundo;
						
			System.out.println("Su hora es " + reloj);
			String resultado = horamasunsegundo(reloj);
			System.out.println("Su hora más un segundo es: " + resultado + "\n");
			System.out.println("¿Quiere volver a intoducir una hora? (Si = 1 ; No = 2)");

			do {
				try {
					Scanner sc2 = new Scanner(System.in);
					int i = sc2.nextInt();

					if (i == 1) {
						condicion2 = false;
						
					} else if (i == 2) {
						condicion = false;
						condicion2 = false;

					} else {
						System.out.println("Introduce 1 ó 2:");

					}
				} catch (InputMismatchException e) {
					System.out.println("Introduce 1 ó 2:");

				}
			} while (condicion2);
		} while (condicion);
		System.out.println("Fin del programa.");
	}

//----------------------------------------------------------------------------------------
	// Recojo los datos
	public static String recogedato(int max, String time) {
		
		Scanner sc = new Scanner(System.in);
		String reloj = "";
		System.out.println("Introduzca los "+ time+ ":");
		boolean min = true;

		do {
			try {
				int minutos = sc.nextInt();

				if (minutos >= 10 && minutos <= max) {
					reloj = ""+minutos;
					min = false;

				} else if (minutos >= 0 && minutos < 10) {
					reloj ="0" + minutos;
					min = false;

				} else {
					System.out.println("Introduzca unos "+time+" válidos.");

				}
			} catch (InputMismatchException e) {
				System.out.println("No se pueden introducir letras u otros caracteres que no sean números.");
				sc.next();
			}

		} while (min);
		return reloj;
	}

//----------------------------------------------------------------------------------------
	
	// Metodo para sumar un segundo
	public static String horamasunsegundo(String hour) {

		int h = Integer.parseInt(hour.substring(0, 2));
		int m = Integer.parseInt(hour.substring(3, 5));
		int s = Integer.parseInt(hour.substring(6, 8));
		String h2, m2, s2;

		if (s >= 0 && s < 59) {
			s++;

		} else {
			s = 0;

			if (m >= 0 && m < 59) {
				m++;
				
			} else {
				m = 0;

				if (h >= 0 && h < 23) {
					h++;
				} else {
					h = 0;

				}
			}
		}
		
		// Guardo la hora en un String y le doy el formato hh:mm:ss
		
		hour = h + ":" +  m + ":" + s;

		int pos1 = hour.indexOf(":");
		h2 = hour.substring(0, pos1);

		if (h2.length() == 1) {
			h2 = "0" + h2;

		}
		hour = hour.substring(pos1 + 1);
		int pos2 = hour.indexOf(":");
		m2 = hour.substring(0, pos2);

		if (m2.length() == 1) {
			m2 = "0" + m2;

		}
		hour = hour.substring(pos2 + 1);
		s2 = hour.substring(0, hour.length());

		if (s2.length() == 1) {
			s2 = "0" + s2;

		}
		hour = h2 + ":" + m2 + ":" + s2;
		return hour;

	}
}