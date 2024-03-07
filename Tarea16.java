package unidad3;

import java.util.Scanner;

public class Tarea16 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String palabra = sc.nextLine();
	int longitud = palabra.length();
	for (int i = 0; i < longitud; i++) {
		System.out.println("Letra" + (i+1) +": "+ palabra.substring(i, i+1));
	}
sc.close();
	}

}
