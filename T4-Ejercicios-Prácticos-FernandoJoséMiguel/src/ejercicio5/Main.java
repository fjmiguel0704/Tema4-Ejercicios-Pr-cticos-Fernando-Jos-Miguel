package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, a;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		a=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		n=read.nextInt();
		
		read.close();
		
		System.out.println(FuncionesRecursivas.sumatorio(a));
		System.out.println();
		System.out.println(FuncionesRecursivas.potencia(a, n));
		System.out.println();
		System.out.println(FuncionesRecursivas.serieFibonacci(n));
	}

}
