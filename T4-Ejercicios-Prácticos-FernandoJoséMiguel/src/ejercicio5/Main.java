package ejercicio5;

import java.util.Scanner;

//Pruebas:
//Introduzco 6, 2. 
//Resulltado esperado: 
//21
//36.0
//2
//Resultado obtenido: 
//21
//36.0
//2
public class Main {

	/**
	 * Método Main
	 * @param args
	 */
	public static void main(String[] args) {
		//Creamos estas variables para guardar los valores del usuario
		int n, a;
		
		//Creamos el scanner y pedimos los números al usuario
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		a=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		n=read.nextInt();
		
		//Cerramos el scanner
		read.close();
		
		//Imprimimos el resultado de todas las funciones de la clase FuncionesRecursivas
		System.out.println(FuncionesRecursivas.sumatorio(a));
		System.out.println();
		System.out.println(FuncionesRecursivas.potencia(a, n));
		System.out.println();
		System.out.println(FuncionesRecursivas.serieFibonacci(n));
	}

}
