package unidad3;
import java.util.Scanner;

public class EjemploExcepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valido = true;
		
	do {	
		System.out.println("Introduzca un n�mero entero:");
		//int num = sc.nextInt();
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			System.out.println("El n�mero introducido es:" + num);
			System.out.println("Fin");
			valido = false;
		}else {
			System.err.println("error, �esto que es?");
			System.out.println(sc.next());
		}
	}while(valido);
		sc.close();
	}

}
