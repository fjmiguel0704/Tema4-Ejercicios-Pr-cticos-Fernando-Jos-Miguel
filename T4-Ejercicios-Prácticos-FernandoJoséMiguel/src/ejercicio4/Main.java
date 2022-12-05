package ejercicio4;

import java.util.Scanner;
import ejercicio4.Operaciones;

//Pruebas:
//Introduzco 6, 3. 
//Resulltado esperado: 
//suma=9
//resta=3
//multiplicación=18
//división=2
//Resultado obtenido: 
//suma=9
//resta=3
//multiplicación=18
//división=2
public class Main {

	/**
	 * Método Main
	 * @param args
	 */
	public static void main(String[] args) {
		//Creamos estas tres variables para recoger los datos del usuario
		int num1, num2, opcion = 0;
		
		//Creamos el objeto operaciones para llamar a la clase Operaciones
		Operaciones operaciones = new Operaciones ();
		
		//Creamos el scanner y pedimos al usuario ambos números y la opción a realizar
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
		
		//Cerramos el scanner
		read.close();
		
		//Realizamos un switch case para indicar la operación a realizar según la opción indicada 
		//e imprimimos la función de la clase Operaciones que contiene dicha opción
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
