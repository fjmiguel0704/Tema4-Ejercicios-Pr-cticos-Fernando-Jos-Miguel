package ejercicio2;

public class Esfera {
	static public int radio;
	static int superficie () {
		int s;
		s= (int) ((4*Math.PI)*(Math.pow(radio, 2)));
		return s;
	}
	
	static int volumen () {
		int v;
		v=(int) ((4*Math.PI/3)*(Math.pow(radio, 3)));
		return v;		
	}
}
