package unidad3;

/**
 * 
 * @author Alberto Medina
 * 
 * Crear un m�todo "numerosImpares" que pas�ndole por par�metro un n�mero entero 
 * pinte esa cantidad en n�meros impares a partir del 5. 
 *
 */

public class Tarea23 {
	
	public static void numerosImpares (int i) {
		
		for (int n = 2; n < 2+i; n++) {
			System.out.println((2*n)+1);

		}
		
	}

	public static void main(String[] args) {
		//Introducir en el n�mero de impares que se quieren imprimir a partir del 5
		numerosImpares(9);
	
	}

}
