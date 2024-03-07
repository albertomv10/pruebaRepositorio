package unidad3;
/**
 * 
 * @author Alberto Medina
 *
 Crea una aplicaci�n que muestre el nombre del cliente y la cantidad de art�culos comprados.

Evaluar el n�mero de art�culos comprados y seg�n esto mostrar un mensaje indicando c�mo deber� pagar el cliente:

Si la cantidad es menor de 5 pagara en efectivo,
si es mayor de 5 y menor de 12 pagara con tarjeta, 
si es mayor de 13 pagara con cheque.

 */
import java.util.Scanner;
public class Tarea1 {
	
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Escriba su nombre a continuaci�n:");
		String nombre = scanner1.nextLine();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Hola "+nombre+", �cu�ntos art�culos ha comprado?");
		int art = scanner2.nextInt();
		
		if (art <= 5) {
			System.out.println("Deber� pagar sus art�culos en efectivo.");
		}else if (art>5 && art<=12) {
			System.out.println("Deber� pagar sus art�culos en con tarjeta.");
		}else if (art>13) {
			System.out.println("Deber� pagar sus art�culos en con cheque.");
		}
		
		scanner1.close();
		scanner2.close();
		
	}

}
