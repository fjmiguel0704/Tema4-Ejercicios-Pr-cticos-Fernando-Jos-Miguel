package ejercicio2;

import java.util.Scanner;

//Pruebas:
//Introduzco 6. Resulltado esperado: s=452², v=904³. Resultado obtenido: s=452², v=904³.
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
		
		//Cerramos el scanner
		read.close();
		
		//Imprimimos el resultado de la función superficie y volumen 
		System.out.println("Superficie: " + Esfera.superficie() + "m²");
		System.out.println("Volumen: " + Esfera.volumen() + "m³");
		
	}

}
