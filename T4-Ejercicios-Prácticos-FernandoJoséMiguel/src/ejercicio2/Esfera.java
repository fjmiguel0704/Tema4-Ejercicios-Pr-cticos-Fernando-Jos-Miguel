package ejercicio2;

/**
 * Clase en la que calcularemos la superficie y vólumen de una esfera
 * @author fernando
 *
 */
public class Esfera {
	
	//Creamos la variable global estática radia
	static public int radio;
	
	
	//Creamos la función superficie en la que calcularemos la superficie de la esfera
	static int superficie () {
		
		//Creamos la variable s, que guardará el resultado de 4*Pi*r²
		int s;
		s= (int) ((4*Math.PI)*(Math.pow(radio, 2)));
		
		//Devolvemos el valor de s
		return s;
	}
	
	//Creamos la función volumen en la que calcularemos el vólumen de la esfera
	static int volumen () {
		
		//Creamos la variable v, que guardará el resultado de 4*Pi/3*radio²
		int v;
		v=(int) ((4*Math.PI/3)*(Math.pow(radio, 3)));
		
		//Devolvemo el valor de v
		return v;		
	}
}