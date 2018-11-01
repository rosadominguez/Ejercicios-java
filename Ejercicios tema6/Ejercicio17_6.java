public class Ejercicio17_6 {
  public static void main(String [] args){
  
  int altura;
  int anchura;
  
  System.out.println("Introduce la altura");
  altura = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce la anchura");
  anchura = Integer.parseInt(System.console().readLine());
  
  int coordenadaFila;
  int coordenadaColumna;
  
  coordenadaFila = (int)(Math.random()*(altura-2))+2;
  coordenadaColumna = (int)(Math.random()*(anchura-2))+2;
  int coordenadaFila1 = (int)(Math.random()*(altura-2))+2;
  int coordenadaColumna1 = (int)(Math.random()*(anchura-2))+2;

   int coordenadaFila2 = (int)(Math.random()*(altura-2))+2;
  int coordenadaColumna2 = (int)(Math.random()*(anchura-2))+2;


  

     for(int contadorFila = 1;contadorFila<=altura; contadorFila++){
		 
	     for(int contadorColumnas = 1;contadorColumnas <= anchura; contadorColumnas++){
			 
			 
			if((contadorFila == 1)||(contadorFila == altura)){
				
			System.out.print("*");
			
			}else if ((contadorColumnas == 1)||(contadorColumnas == anchura)){
				
			System.out.print("*");
			
			}else if  ((contadorFila == coordenadaFila) && (contadorColumnas == coordenadaColumna)){
				
            System.out.print("&");
            
            }else if  ((contadorFila == coordenadaFila1) && (contadorColumnas == coordenadaColumna1)){
				
            System.out.print("&");
            
            }else if  ((contadorFila == coordenadaFila2) && (contadorColumnas == coordenadaColumna2)){
				
            System.out.print("&");
            
			}else{
				
            System.out.print(" ");
			}
			
            }
            System.out.println(" ");
		 }
	 
}
}

