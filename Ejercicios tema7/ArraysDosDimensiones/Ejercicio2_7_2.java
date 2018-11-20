public class Ejercicio2_7_2{
  public static void main(String [] args){
  
	//Escribe un programa que pida 20 números enteros. Estos números se deben
	//introducir en un array de 4 filas por 5 columnas. El programa mostrará las
	//sumas parciales de filas y columnas igual que si de una hoja de cálculo se
	//tratara. La suma total debe aparecer en la esquina inferior derecha.
	
	System.out.println("Vamos a sumar");
	
	int [][] numeros = new int [5][6];
	int fila;
	int columna;
	int sumaFila = 0;
	int colu1=0;
	int colu2=0;
	int colu3=0;
	int colu4=0;
	int colu5=0;


	
	
		for ( fila = 0; fila<4;fila++){
			for(columna = 0;columna<5;columna++){
				System.out.print("fila " + fila + ", columna " + columna + ":");
				numeros[fila][columna] = Integer.parseInt(System.console().readLine());
			}
		}
		
		System.out.println(" ");
		
		for(fila = 0;fila<4;fila++){
			for(columna = 0;columna< 5; columna++){
				System.out.printf("%5d|",numeros[fila][columna]);
			}
			System.out.println("");	
		}
		
		System.out.println("****************************************");
		System.out.println(" ");
			System.out.print("Colum");
			for(int i = 0;i<6;i++){
				System.out.printf("%5d|", i);
			}
			System.out.println(" ");
			System.out.println("-----------------------------------------");
			for(fila = 0; fila<5;fila++){
				System.out.print("Fila" + fila);
				sumaFila = 0;
				if(fila ==4){
					System.out.printf("%5d|%5d|%5d|%5d|%5d|", colu1,colu2,colu3,colu4,colu5);
			    }else{
					for(columna = 0;columna<6; columna++){
						sumaFila = sumaFila + (numeros[fila][columna]);
						if(columna == 5){
							System.out.printf("%5d|",sumaFila);
						}else{
							System.out.printf("%5d|",numeros[fila][columna]);
							if ( columna==0){
								colu1= colu1 + numeros[fila][columna];
							}else if ( columna==1){
								colu2= colu2 + numeros[fila][columna];
							}else if ( columna==2){
								colu3= colu3 + numeros[fila][columna];
							}else if ( columna==3){
								colu4= colu4 + numeros[fila][columna];
							}else if ( columna==4){
								colu5= colu5 + numeros[fila][columna];
							}
							
						}
					}
					
					System.out.println(" ");	
						}
				}
					System.out.printf("%5d|",colu1+colu2+colu3+colu4+colu5);
							
	}
}

