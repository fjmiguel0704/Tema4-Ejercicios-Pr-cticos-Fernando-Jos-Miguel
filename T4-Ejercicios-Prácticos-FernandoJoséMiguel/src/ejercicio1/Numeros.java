package ejercicio1;

/**
 * Clase en la que comprobamos si un número es primo o no y si es capicúa o no. 
 * Mediante dos funciones
 * @author fernando
 *
 */
public class Numeros {
	
	//Creamos la función esPrimo para comprobar si (numero) es o no primo.  
	   boolean esPrimo(int numero) {
		   
		   //Si el número introducido es menor o igual a 1, no es primo
		  if(numero<=1) {
			  return false;
		  }
		  
		  //Creamos i, y la incrementamos mientras sea menor que numero
		for(int i = 2; i<numero; i++) {
			
			//Si numero entre i da de resto 0, no es primo
			if (numero%i==0) {
				return false;
			}
		}
		
		//Por lo contrario, si lo es
		return true;
	}
	   
	   //Función esCapicua para comprobar si (numero) es o no capicúa
	   boolean esCapicua (int numero) {
		   
		   //Creamos la variable auxiliar que va a guardar el numero, el resto y el numero invertido
		   int auxiliar = numero, resto, numInvert=0;
		   
		   //Mientras que auxiliar sea distinto a 0
			while(auxiliar!=0) {
				
				//resto será igual a auxiliar entre 10, numero invertido es igual a numero invertido por 10 + el resto y auxiliar será esta entre 10
				resto=auxiliar%10;
				numInvert=numInvert*10+resto;
				auxiliar/=10;	
			}

			//Si numero invertido es igual al numero, es capicúa
		    if(numInvert==numero){
		    	return true;
			}
		    
		    //En caso contrario, no lo es
		    else {       
	        return false;	
			}
	   }
}
