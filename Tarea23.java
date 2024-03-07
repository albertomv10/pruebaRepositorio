package unidad3;

/**
 * 
 * @author Alberto Medina
 * 
 * Crear un método "numerosImpares" que pasándole por parámetro un número entero 
 * pinte esa cantidad en números impares a partir del 5. 
 *
 */

public class Tarea23 {
	
	public static void numerosImpares (int i) {
		
		for (int n = 2; n < 2+i; n++) {
			System.out.println((2*n)+1);

		}
		
	}

	public static void main(String[] args) {
		//Introducir en el número de impares que se quieren imprimir a partir del 5
		numerosImpares(9);
	
	}

}
