package ejercicio2;

import java.util.Scanner;

public class Main {

	/**
	 * Método Main
	 * @author fernando
	 *
	 */
	public static void main(String[] args) {
		
		//Creamos el scanner y pedimos el radio de la superficie
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el radio de la superficie: ");
		Esfera.radio= read.nextInt();
		
		//Imprimimos el resultado de la función superficie y volumen 
		System.out.println("Superficie: " + Esfera.superficie() + "m²");
		System.out.println("Volumen: " + Esfera.volumen() + "m³");
		
	}

}
