package ejercicio4;

import java.util.Scanner;
import ejercicio4.Operaciones;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		
		Scanner read = new Scanner (System.in);
		
		Operaciones operaciones = new Operaciones ();
		
		System.out.println("Que operación desea realizar: ");
		System.out.println("a) [1] SUMAR");
		System.out.println("b) [2] RESTAR");
		System.out.println("c) [3] MULTIPLICAR");
		System.out.println("d) [4] DIVIDIR");
		opcion=read.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println(operaciones.suma()); 
			break;
		case 2:
			System.out.println(operaciones.resta()); 
			break;
		case 3:
			System.out.println(operaciones.multiplicacion());
			break;
		case 4:
			System.out.println(operaciones.division()); 
			break;
		default:
			System.out.println("La opción introducida no es correcta");
		}
	}

}
