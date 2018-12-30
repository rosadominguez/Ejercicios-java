	package matematicas;
	
	public class funciones{
		
	public static long volteo(long num){
	
	long resultado = 0;
	long volteo = 0;
	long aux = 0;
	
	
	aux = num;
	
	while(aux !=0){
		
		resultado = aux%10;
		volteo = volteo*10 + resultado;
		aux = aux/10;	
	}
	
	return volteo;
	
	}
	
  
	public static boolean capicua(long num){
		
	long resultado = 0;
	long volteo = 0;
	long aux = 0;
	
		aux = num;
	
	while(aux !=0){
		
		resultado = aux%10;
		volteo = volteo*10 + resultado;
		aux = aux/10;	
	}

	if(num != volteo){
		return false;
	}
	return true;
 }
 
 public static long multiplicar(long x,long y){
	
	 long resultado = 0;
	 
	 resultado = x * y;
	 
	 return resultado;
 }
 
 public static boolean esPrimo(int num){
	 
	 boolean esPrimo = false;
	 
	 for(int i =2; i< num;i++){
	 
		if(num%i == 0){
			return false;
		}
	}
	return true;
  }
}





	
	
