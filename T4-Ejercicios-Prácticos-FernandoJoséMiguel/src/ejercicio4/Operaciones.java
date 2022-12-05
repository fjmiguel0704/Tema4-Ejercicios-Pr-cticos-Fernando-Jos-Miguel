package ejercicio4;

import java.util.Scanner;

/**
 * Clase donde recoger los cálculos de cada una de las operaciones
 * @author fernando
 *
 */
public class Operaciones {
	//Creamos numero1 y numero2, sobre los que se realizarán los cálculos
	int num1, num2;
	
	//Creamos la función suma y esta devolverá la suma de ambos números
	int suma() {
		return num1+num2;
	}
	
	//Creamos la función resta y esta devolverá la resta de ambos números
	int resta () {
		return num1-num2;
	}
	
	//Creamos la función multiplicacion y esta devolverá la multiplicación de ambos números
	int multiplicacion() {
		return num1*num2;
	}
	
	//Creamos la función division y esta devolverá la división de ambos números
	int division() {	
		return num1/num2;
	}
		
}
