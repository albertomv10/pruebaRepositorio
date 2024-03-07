package unidad3;
import java.util.InputMismatchException;
//import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author2 Alberto Medina
 * 
 *         Crear una aplicaci�n que solicite una frase y la almacene en una
 *         variable.
 * 
 *         A continuaci�n se crear un men� con las siguientes opciones:
 * 
 *         1. Mostrar la longitud (muestra el n�mero de caracteres que contiene
 *         la frase) 2. N�mero de palabras (cuenta el n�mero de palabras que
 *         contiene la frase y muestra el resultado) 3. Cambiar frase (vuelve a
 *         solicitar que se introduzca otra frase) 4. Mostrar la primera palabra
 *         (muestra la primera palabra de la frase introducida) 5. Mostrar la
 *         �ltima palabra (muestra la �ltima palabra de la frase introducida) 6.
 *         Fin (termina la ejecuci�n del programa)
 */

public class Tarea17Mejorada {
	// M�todo que recibe un String y devuelve la primera palabra de esa frase
	public static void primera_palabra(String frase) {
		int pos = frase.indexOf(" ");
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "La primera palabra es \"" + frase.substring(0, pos) + "\"");
			//System.out.println("La primera palabra es \"" + frase.substring(0, pos) + "\"\n");
		} else {
			JOptionPane.showMessageDialog(null, "La primera palabra es \"" + frase + "\"");
			//System.out.println("La primera palabra es \"" + frase + "\"\n");
		}
	}

	// M�todo que recibe un String y devuelve la �ltima palabra de esa frase.
	public static void ultima_palabra(String frase) {
		int pos2 = frase.lastIndexOf(" ");
		if (pos2 != -1) {
			JOptionPane.showMessageDialog(null, "La �ltima palabra es \"" + frase.substring(pos2 + 1, frase.length()) + "\"");
			//System.out.println("La �ltima palabra es \"" + frase.substring(pos2 + 1, frase.length()) + "\"\n");
		} else {
			JOptionPane.showMessageDialog(null, "La �ltima palabra es \"" + frase + "\"");
			//System.out.println("La �ltima palabra es \"" + frase + "\"\n");
		}
	}

	// M�todo que recibe un String y devuelve el n�mero de palabras que contiene
	public static int contarPalabras(String s) {
		int contador = 1, pos;
		if (s.isEmpty()) { // si la cadena est� vac�a
			contador = 0;
		} else {
			pos = s.indexOf(" "); // se busca el primer espacio en blanco
			while (pos != -1) { // mientras que se encuentre un espacio en blanco
				contador++; // se cuenta una palabra
				pos = s.indexOf(" ", pos + 1); // se busca el siguiente espacio en blanco
			} // a continuaci�n del actual
		}
		return contador;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		boolean condicion = true;
		String palabra = JOptionPane.showInputDialog("Introduzca una frase");
		palabra = palabra.trim();
		do {
			try {	
				
				/*System.out.println("\n------------------------------------------------------");
				System.out.println("Elije una opci�n:");
				System.out.println("1 - Mostrar n�mero de caracteres.\r\n" + "2 - Mostrar n�mero de palabras \r\n"
						+ "3 - Cambiar frase \r\n" + "4 - Mostrar la primera palabra \r\n"
						+ "5 - Mostrar la �ltima palabra  \r\n" + "6 - Fin");
				System.out.println("------------------------------------------------------\n");
				Scanner sc2 = new Scanner(System.in);
				*/
				String [] opciones = {"N�mero de caracteres", "N�mero de palabras", 
						"Cambiar frase", "Primera palabra", 
						"�ltima palabra", "Cancelar"};
						
				
				int i = JOptionPane.showOptionDialog(null, "Elije una opci�n", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[5] );
				switch (i) {
				case 0:
					JOptionPane.showMessageDialog(null, "La frase introducida tiene " + palabra.length() + " caracteres");
					//System.out.println("La frase introducida tiene " + palabra.length() + " caracteres \n");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "La frase introducida tiene " + contarPalabras(palabra) + " palabras");
					//System.out.println("La frase introducida tiene " + contarPalabras(palabra) + " palabras \n");
					break;
				case 2:
					palabra = JOptionPane.showInputDialog("Introduzca una nueva frase");
					//System.out.println("Introduzca otra frase: ");
					// sc.next();
					break;
				case 3:
					primera_palabra(palabra);
					break;
				case 4:
					ultima_palabra(palabra);
					break;
				case 5:
					System.out.println("FIN");
					condicion = false;
					break;
				default:
					System.err.println("Error 303. Introduce un n�mero de las opciones del men�. \n");
					break;
				}
				// sc2.close();

			} catch (InputMismatchException ex) {
				JOptionPane.showMessageDialog(null, "\"Error 404. Introduce un n�mero.\"",
					      "ERROR!", JOptionPane.ERROR_MESSAGE);
				//System.err.println("Error 404. Introduce un n�mero.");
			}
		} while (condicion);
		

//sc.close();
	}

}
