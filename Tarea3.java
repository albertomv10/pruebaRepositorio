package unidad3;
import java.util.Scanner;

/**
 * 
 * @author Alberto Medina
 * 
 * 
Solicitar por teclado la estación del año favorita del usuario (primavera, verano, otoño o invierno).

Una vez que el usuario introduzca la estación mostrar un mensaje por consola indicando algo característico 
que se realiza en esa estación del año.

Si la estación del año favorita es verano además deberás preguntar al usuario si veranea en la playa 
y en caso de que responda que sí mostrarle los nombres de algunas playas de Murcia.
 *
 */

public class Tarea3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su estación del año favorita:");
		String est = sc.nextLine();
		//Declaro las estaciones
	
		
		if (est.equalsIgnoreCase("Verano")) {
			System.out.println("En verano es la estación más frecuente para irse de vacaciones.");
			System.out.println("¿Veraneas en la playa?");
			String playa = sc.nextLine();
			
			if (playa.equalsIgnoreCase("Si")) {
				System.out.println("Entonces te podría interesar visitar algunas de las playas de la Región de Murcia como Calbalnque, La Azohia, Bolnuevo o La Manga");
			}else {
				System.out.println("Normal, la playa está sobrevalorada");
			}
		}else if (est.equalsIgnoreCase("Otoño")) {
			System.out.println("En otoño se celebra en todo el mundo la famosa fiesta de Halloween en dia 31 de octubre");
		}else if (est.equalsIgnoreCase("Invierno")) {
			System.out.println("En invierno se celebra, según la tradición cristiana, el nacimiento del niño Jesús.");
		}else if (est.equalsIgnoreCase("Primavera")) {
			System.out.println("En primavera se celebra en Murcia, después de la Semana Santa, las Fiestas de primavera con eventos como el Bando de la Huerta o el Entierro de la Sardina.");
		}else {
			System.err.println("Por favor introduzca una estación del año válida");
		}
		
		sc.close();

	}

}