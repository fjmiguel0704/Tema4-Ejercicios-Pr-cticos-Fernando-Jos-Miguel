package ejercicio1;

import java.util.Scanner;

//Pruebas:
//Introduzco 252. Resulltado esperado: false, true. Resultado obtenido: false, true.
//Introduzco 3. Resulltado esperado: true, true. Resultado obtenido: true, true.
//Introduzco 23. Resulltado esperado: true, false. Resultado obtenido: true, false.
public class Main {

	/**
	 * Método Main
	 * @author fernando
	 *
	 */
	public static void main(String[] args) {
		
		//Creamos número
		int numero;
		
		//Creamos el objeto metodo para poder fallar a la clase Numeros
		Numeros metodo = new Numeros();
		
		//Creamos el scanner y pedimos un número
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el número a comprobar: ");
		numero=read.nextInt();
		
		//Cerramos el scanner
		read.close();
		
		//Imprimimos por consola el resultado de la función esPrimo y el de esCapicua
		System.out.println("Primo: "+metodo.esPrimo(numero)); 
		System.out.println();
		System.out.println("Capicúa: "+metodo.esCapicua(numero));
	}

}
