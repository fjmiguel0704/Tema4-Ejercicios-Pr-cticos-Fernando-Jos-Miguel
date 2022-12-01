package ejercicio1;

public class Numeros {
	   boolean esPrimo(int numero) {
		  if(numero<=1) {
			  return false;
		  }
		for(int i = 2; i<numero; i++) {
			if (numero%i==0) {
				return false;
			}
		}
		return true;
	}
	   
	   
	   boolean esCapicua (int numero) {
		   int auxiliar = numero, resto, numInvert=0;
			while(auxiliar!=0) {
				resto=auxiliar%10;
				numInvert=numInvert*10+resto;
				auxiliar/=10;	
			}

		    if(numInvert==numero){
		    	return true;
			}
		    else {       
	        return false;	
			}
	   }
}
