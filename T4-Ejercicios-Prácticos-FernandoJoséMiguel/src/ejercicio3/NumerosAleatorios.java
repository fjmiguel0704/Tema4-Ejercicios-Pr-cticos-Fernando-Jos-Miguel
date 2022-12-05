package ejercicio3;

/**
 * Clase en la que generaremos números aleatorios entre un rango indicado
 * @author fernando
 *
 */
public class NumerosAleatorios {
	
	//CReamos la función numerosAleatorios, que generará tantos números aleatorios indicados por el usuario entre 0 y 1
	static void numerosAleatorios (int cantidad) {
		
		//Creamos i, y la incrementamos mientras sea menor o igual a cantidad
		for(int i = 1; i<=cantidad; i++ ) {
			
			//Imprimimos el resultado de generar los números
			System.out.println(Math.random());
		}
	}
	
	//Creamos otra función en la que generaremos tantos números indique el usuario, entre 0 y el máximo indicado
	static void numerosAleatorios (int cantidad, int max) {
		//Creamos la variable numero que guardará el resulltado de generar el número y sumarle cero y medio
		double numero;
		
		//Creamos i, y la incrementamos mientras sea menor o igual a la cantidad
		for(int i = 1; i<=cantidad; i++ ) {
			numero=Math.random()*max;
			numero+=0.5;
			
			//Imprimimos el valor de número
			System.out.println((int)numero);
		}
	}
	
	//Creamos otra función en la que generaremos tantos números indique el usuario, entre un mínimo indicado y un máximo indicado
	static void numerosAleatorios (int cantidad, int max, int min) {
		
		//Creamos la variable numero que guardará el resulltado de generar el número y sumarle cero y medio
		double numero;
		for(int i = 1; i<=cantidad; i++ ) {
			numero=Math.random()*(max-min)+min;
			numero+=0.5;
			
			//Imprimimos el valor de numero
			System.out.println((int)numero); 
		}
	}
}



