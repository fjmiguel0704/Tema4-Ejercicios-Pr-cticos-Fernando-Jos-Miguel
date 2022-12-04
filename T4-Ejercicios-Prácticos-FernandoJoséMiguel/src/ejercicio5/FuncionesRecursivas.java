package ejercicio5;

public class FuncionesRecursivas {
	static int sumatorio(int numero) {
		int suma = 0;
		for(int i = 1; i<=numero; i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	static double potencia (double a, int n) {
		double resultado = 0;
			resultado=Math.pow(a, n);
		
		return resultado;
	}
	
	static int serieFibonacci(int a) {
		if(a==0) {
			return 0;
		}
		
		else if (a==1) {
			return 1;
		}
		
		else {
		return serieFibonacci(a-1) + serieFibonacci(a-2);
		}
	}
}
