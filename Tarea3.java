package unidad3;
import java.util.Scanner;

/**
 * 
 * @author Alberto Medina
 * 
 * 
Solicitar por teclado la estaci�n del a�o favorita del usuario (primavera, verano, oto�o o invierno).

Una vez que el usuario introduzca la estaci�n mostrar un mensaje por consola indicando algo caracter�stico 
que se realiza en esa estaci�n del a�o.

Si la estaci�n del a�o favorita es verano adem�s deber�s preguntar al usuario si veranea en la playa 
y en caso de que responda que s� mostrarle los nombres de algunas playas de Murcia.
 *
 */

public class Tarea3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su estaci�n del a�o favorita:");
		String est = sc.nextLine();
		//Declaro las estaciones
	
		
		if (est.equalsIgnoreCase("Verano")) {
			System.out.println("En verano es la estaci�n m�s frecuente para irse de vacaciones.");
			System.out.println("�Veraneas en la playa?");
			String playa = sc.nextLine();
			
			if (playa.equalsIgnoreCase("Si")) {
				System.out.println("Entonces te podr�a interesar visitar algunas de las playas de la Regi�n de Murcia como Calbalnque, La Azohia, Bolnuevo o La Manga");
			}else {
				System.out.println("Normal, la playa est� sobrevalorada");
			}
		}else if (est.equalsIgnoreCase("Oto�o")) {
			System.out.println("En oto�o se celebra en todo el mundo la famosa fiesta de Halloween en dia 31 de octubre");
		}else if (est.equalsIgnoreCase("Invierno")) {
			System.out.println("En invierno se celebra, seg�n la tradici�n cristiana, el nacimiento del ni�o Jes�s.");
		}else if (est.equalsIgnoreCase("Primavera")) {
			System.out.println("En primavera se celebra en Murcia, despu�s de la Semana Santa, las Fiestas de primavera con eventos como el Bando de la Huerta o el Entierro de la Sardina.");
		}else {
			System.err.println("Por favor introduzca una estaci�n del a�o v�lida");
		}
		
		sc.close();

	}

}