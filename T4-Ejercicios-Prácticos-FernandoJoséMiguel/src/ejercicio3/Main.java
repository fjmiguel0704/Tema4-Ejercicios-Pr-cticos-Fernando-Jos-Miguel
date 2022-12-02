package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int  cantidad, valorMax, valorMin;
		
		Scanner read = new Scanner (System.in);
		System.out.println("¿Cuántos números desea generar entre 0 y 1?: ");
		cantidad=read.nextInt();
		System.out.println("Valor máximo a generar: ");
		valorMax=read.nextInt();
		System.out.println("Valor mínimo a generar: ");
		valorMin=read.nextInt();
		
		read.close();
		
		NumerosAleatorios.numerosAleatorios(cantidad);
		System.out.println("Valor máximo: ");
		NumerosAleatorios.numerosAleatorios(cantidad, valorMax);
		System.out.println("Entre mínimo y máximo: ");
		NumerosAleatorios.numerosAleatorios(cantidad, valorMax, valorMin);
		
	}

	}

