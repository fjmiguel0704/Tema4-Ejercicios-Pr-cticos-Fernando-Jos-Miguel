package ejercicio4;

import java.util.Scanner;

public class Operaciones {
	public int num1, num2;
	Scanner read=new Scanner (System.in);
	
	int suma() {
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		return num1+num2;
	}
	
	int resta () {
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		return num1-num2;
	}
	
	int multiplicacion() {
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		return num1*num2;
	}
	
	int division() {
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		return num1/num2;
	}
		
}
