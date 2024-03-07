package unidad3;

/**
 * @author Alberto Medina
 * 
 * Hacer un programa que solicite 5 nombres de frutas 
 * y componga una contrase�a utilizando los dos primeros caracteres de cada fruta insertada.
 */

import java.util.Scanner;

public class Tarea18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para crear una contrase�a a partir de 5 frutas.\n");
		String pass = "";
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Introduzca la fruta " + i + ":");
				String fruta = sc.nextLine();
				pass = pass + fruta.substring(0, 2);

			} catch (StringIndexOutOfBoundsException e) {
				System.err.println("Error. n�mero insuficiente de caracteres.");
				i--;
			} catch (Exception e) {
				System.err.println("Error. Campo no v�lido.");
				i--;
			}
		}
		System.out.println("Tu contrase�a es: " + pass);
		sc.close();
	}

}
