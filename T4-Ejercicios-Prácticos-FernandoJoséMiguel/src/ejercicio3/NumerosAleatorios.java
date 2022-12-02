package ejercicio3;

public class NumerosAleatorios {
	
	static void numerosAleatorios (int cantidad) {
		for(int i = 1; i<=cantidad; i++ ) {
			System.out.println(Math.random());
		}
	}
	
	static void numerosAleatorios (int cantidad, int max) {
		double numero;
		for(int i = 1; i<=cantidad; i++ ) {
			numero=Math.random()*max;
			numero+=0.5;
			System.out.println((int)numero);
		}
	}
	
	static void numerosAleatorios (int cantidad, int max, int min) {
		double numero;
		for(int i = 1; i<=cantidad; i++ ) {
			numero=Math.random()*(max-min)+min;
			numero+=0.5;
			System.out.println((int)numero); 
		}
	}
}



