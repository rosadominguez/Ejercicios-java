public class Ejercicio1_7_2 {
  public static void main(String [] args){
  
	//Define un array de números enteros de 3 filas por 6 columnas con nombre num
	//y asigna los valores según la siguiente tabla. Muestra el contenido de todos
	//los elementos del array dispuestos en forma de tabla como se muestra en la
	//figura.
	
	System.out.println("Tabla");
	
		int fila=0;
		int columna=0;
		int [][] num = new int [3][6];
	
		num[0][0] = 0 ;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
	
		System.out.printf("Columnas");
		
		for(columna = 0;columna<6;columna++){
			System.out.printf("%9d", columna);
		}
			System.out.println(" ");

		for( fila=0;fila<3;fila++){
			System.out.print("filas   "+fila);
		for(columna = 0;columna<6;columna++){
			System.out.printf("%8d ",num[fila][columna]," | ");
		}
			System.out.println(" ");
		}
	}
}
	
