package ejercicio4;

import java.util.Scanner;
import ejercicio4.Operaciones;

public class Main {

	public static void main(String[] args) {
		int num1, num2, opcion = 0;
		
		Operaciones operaciones = new Operaciones ();
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduce el primer número: ");
		operaciones.num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		operaciones.num2=read.nextInt();
		System.out.println("Que operación desea realizar: ");
		System.out.println("a) [1] SUMAR");
		System.out.println("b) [2] RESTAR");
		System.out.println("c) [3] MULTIPLICAR");
		System.out.println("d) [4] DIVIDIR");
		opcion=read.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("La suma de sus números es: "+operaciones.suma()); 
			break;
		case 2:
			System.out.println("La resta de sus números es: "+operaciones.resta()); 
			break;
		case 3:
			System.out.println("La multiplicación de sus números es: "+operaciones.multiplicacion());
			break;
		case 4:
			System.out.println("La división de sus números es: "+operaciones.division()); 
			break;
		default:
			System.out.println("La opción introducida no es correcta");
		}
	}

}
