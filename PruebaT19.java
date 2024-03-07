package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaT19 {

	public static void main(String[] args) {
		
		String hora = recogedato(23, "horas");
		String minuto = recogedato(59, "minutos");
		String segundo = recogedato(59, "segundos");
		System.out.println(hora+":"+minuto+":"+segundo);

	}
	
	// Metodo para recoger la hora en un String
		public static String recogerhora() {

			Scanner sc = new Scanner(System.in);

			String reloj = "";

			// Recojo las horas
			System.out.println("Introduzca la hora:");

			boolean hor = true;

			do {

				try {

					int hora = sc.nextInt();

					//  int horrg = Integer.parseInt(hora);

					if (hora >= 10 && hora <= 23) {

						reloj = hora + ":";

						hor = false;

					} else if (hora>= 0 && hora < 10) {

						reloj = "0" + hora + ":";

						hor = false;

					} else {

						System.out.println("Introduzca una hora válida.");

					}

				} catch (InputMismatchException e) {

					System.out.println("No se pueden introducir letras u otros caracteres que no sean números.");
					sc.next();
				}

			} while (hor);

			// Recojo los minutos
			System.out.println("Introduzca los minutos:");

			boolean min = true;

			do {

				try {

					int minutos = sc.nextInt();

					// int minrg = Integer.parseInt(minutos);

					if (minutos >= 10 && minutos <= 59) {

						reloj = reloj + minutos + ":";

						min = false;

					} else if (minutos >= 0 && minutos < 10) {

						reloj = reloj + "0" + minutos + ":";

						min = false;

					} else {

						System.out.println("Introduzca unos minutos válidos.");

					}

				} catch (InputMismatchException e) {

					System.out.println("No se pueden introducir letras u otros caracteres que no sean números.");
					sc.next();
				}

			} while (min);

			// Recojo los segundos
			System.out.println("Introduzca los segundos:");

			boolean seg = true;

			do {

				try {

					int segundos = sc.nextInt();

					// int segrg = Integer.parseInt(segundos);

					if (segundos >= 10 && segundos <= 59) {

						reloj = reloj + segundos;

						seg = false;

					} else if (segundos >= 0 && segundos < 10) {

						reloj = reloj + "0" + segundos;

						seg = false;

					} else {

						System.out.println("Introduzca unos segundos válidos.");

					}

				} catch (InputMismatchException e) {

					System.out.println("No se pueden introducir letras u otros caracteres que no sean números.");
					sc.next();
				}

			} while (seg);

			// sc.close();
			return reloj;
		}
		
		public static String recogedato(int max, String time) {
			// Recojo los minutos
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
		
		
		

}
