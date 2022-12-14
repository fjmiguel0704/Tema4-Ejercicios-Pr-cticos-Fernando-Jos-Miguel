package ejercicio3;

import java.util.Scanner;

//Pruebas:
//Introduzco generar=3, max=2, min=5. 
//Resulltado esperado: 
//1: 0.38139217509615253, 0.8680790550352865, 0.7358899842423313
//2: 2, 1, 0
//3: 4, 3, 4 
//Resultado obtenido: 
//1: 0.38139217509615253, 0.8680790550352865, 0.7358899842423313
//2: 2, 1, 0
//3: 4, 3, 4 
public class Main {

	/**
	 * Método Main
	 * @param args
	 */
	public static void main(String[] args) {
		//Creamos estas tres variables para recoger los datos del usuario
		int  cantidad, valorMax, valorMin;
		
		//Creamos el scanner y solicitamos los datos a recoger. Cantidad de números a generar, número mínimo y máximo
		Scanner read = new Scanner (System.in);
		System.out.println("¿Cuántos números desea generar entre 0 y 1?: ");
		cantidad=read.nextInt();
		System.out.println("Valor máximo a generar: ");
		valorMax=read.nextInt();
		System.out.println("Valor mínimo a generar: ");
		valorMin=read.nextInt();
		
		//Cerramos el scanner
		read.close();
		
		//LLamamos a las funciones de la clase NumerosAleatorios
		NumerosAleatorios.numerosAleatorios(cantidad);
		System.out.println("Valor máximo: ");
		NumerosAleatorios.numerosAleatorios(cantidad, valorMax);
		System.out.println("Entre mínimo y máximo: ");
		NumerosAleatorios.numerosAleatorios(cantidad, valorMax, valorMin);
		
	}

	}

