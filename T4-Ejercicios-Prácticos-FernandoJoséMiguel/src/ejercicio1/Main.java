package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		
		Numeros metodo = new Numeros();
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el número a comprobar: ");
		numero=read.nextInt();
		
		System.out.println("Primo: "+metodo.esPrimo(numero)); 
		System.out.println();
		System.out.println("Capicúa: "+metodo.esCapicua(numero));
	}

}
