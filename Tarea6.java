package unidad3;
/**
 * 
 * @author Alberto Medina
 * 
 * Mostrar los n�meros impares del 1 al 100 utilizando el bucle for.
 *
 */
public class Tarea6 {

	public static void main(String[] args) {
		System.out.println("N�meros impares del 1 al 100:");
		for(int i = 0; i<50; i++) {
			int impares = 2*i +1;
			System.out.println(impares);
		}

	}

}
