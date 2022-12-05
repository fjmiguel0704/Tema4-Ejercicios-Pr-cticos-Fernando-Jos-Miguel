package ejercicio5;

/**
 * Clase en la que devolver la suma de 1 hasta n, n al x y correspondiente de n en serie fibonacci
 * @author fernando
 *
 */
public class FuncionesRecursivas {
	
	//Creamos la función sumatorio, que devolverá la suma de 1 hasta el número (numero) introducido por el usuario
	static int sumatorio(int numero) {
		
		//Creamos suma
		int suma = 0;
		
		//Incrementamos mientras sea menor o igual a numero
		for(int i = 1; i<=numero; i++) {
			
			//A suma le sumamos i
			suma+=i;
		}
		
		//Devolvemos el valor de suma
		return suma;
	}
	
	//Creamos la función potencia, que devolverá el resultado de elevar el número introducido por el usuario (a) al indicado por el usuario también (n) 
	static double potencia (double a, int n) {
		
		//Creamos resultado y devolverá el resultado de elevar a a n
		double resultado = 0;
			resultado=Math.pow(a, n);
		
		return resultado;
	}
	
	//Creamos la función serieFibonacci, que devolverá la posición correspondiente respecto al número introducido por el usuario (a)
	static int serieFibonacci(int a) {
		
		//Si el número introducido por el usuario es igual a 0 o 1, devuelve 1
		if(a==0||a==1) {
			return 1;
		}
		
		//Si no, devuelve el resultado de la siguiente operación
		else {
		return serieFibonacci(a-1) + serieFibonacci(a-2);
		}
	}
}
