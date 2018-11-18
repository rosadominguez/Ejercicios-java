public class Ejercicio12_7 {
  public static void main(String [] args) {
  
	//Realiza un programa que pida 10 números por teclado y que los almacene en
	//un array. A continuación se mostrará el contenido de ese array junto al índice
	//(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
	//inicial y final. Se debe comprobar que inicial es menor que final y que
	//ambos números están entre 0 y 9. El programa deberá colocar el número de
	//la posición inicial en la posición final, rotando el resto de números para que no
	//se pierda ninguno. Al final se debe mostrar el array resultante.
	
	System.out.println("Vamos a cambiar numeros");
	
	int [] numeros = new int[10];
	int posIni;
	int posFin;
	int []resultado = new int[10];
	boolean numBien = true;
	
	System.out.println("Por favor introduzca 10 numeros,pulse intro para separarlos");
	
		for (int i = 0;i < 10;i++){
		
			numeros[i] = Integer.parseInt(System.console().readLine());
		}
		System.out.print("Posicion|");
	
		for (int i = 0;i<10;i++){
			System.out.printf("%3d |",i);
		}
		
		System.out.println(" ");
		System.out.print("Numeros |");
			
		for ( int i = 0;  i < 10;i++){
			System.out.printf("%3d |",numeros[i]);
		}
		System.out.println(" ");
	
		do{
			System.out.println("Indique la poscicion que quiere cambiar");
			posIni = Integer.parseInt(System.console().readLine());
			System.out.println("Indique la poscicion que quiere cambiar");
			posFin = Integer.parseInt(System.console().readLine());
	
			if(posIni <0){
				System.out.println("El numero introducido en  la primera posicion es incorrecto,vuelva a intentarlo");
				numBien = false;
			}else if(posFin>9){
				System.out.println("El numero introducido en la segunda posicion es incorrecto,vuelva a intentarlo");
				numBien = false;
			}else if(posFin < posIni){
				System.out.println("Los numeros introducidos son incorrectos,vuelva a intentarlo");
				numBien = false;
			}else{
				numBien = true;
			}
	
		}while(numBien == false);
		
	
	
			for (int i = 0; i <10;i++){
				resultado[i] = numeros[i];
			}
			
			resultado[posFin] = resultado[posIni];
		
			for(int i = (posFin +1);i<10;i++){
				resultado[i] = numeros[i-1];
			}
			
			resultado[0] = numeros[9];
	
			for(int i = 0;i < posIni;i++){
				resultado[i + 1 ]= numeros[i];
			}
			System.out.print("Posicion|");
	
			for (int i = 0;i<10;i++){
				System.out.printf("%3d |",i);
			}
			
			System.out.println(" ");
			System.out.print("Numeros |");
			
			for ( int i = 0;  i < 10;i++){
				System.out.printf("%3d |",resultado[i]);
			}
	}
}
			
	
