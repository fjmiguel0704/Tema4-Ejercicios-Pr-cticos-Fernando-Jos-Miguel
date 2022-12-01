package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el radio de la superficie: ");
		Esfera.radio= read.nextInt();
		
		System.out.println("Superficie: " + Esfera.superficie() + "m²");
		System.out.println("Volumen: " + Esfera.volumen() + "m³");
		
	}

}
