
import matematicas.funciones;

public class Ejercicio8_1_14 {
	
	public static void main(String [] args) {

	int num;
	
	System.out.println("Introducir numero para saber si es capicua: ");
	num = Integer.parseInt(System.console().readLine());
	
	if(matematicas.funciones.capicua(num)){
		System.out.println("El numero es capicua");
	}else{
		System.out.println("El numero no es capicua");
	}
	
	System.out.println(matematicas.funciones.volteo(num));
	
	int num2;
	System.out.println("Introduce el numero por el que quieres multiplicar");
	num2=Integer.parseInt(System.console().readLine());
	
	System.out.println(matematicas.funciones.multiplicar(num, num2));
	
	System.out.println(matematicas.funciones.volteo(num) * matematicas.funciones.multiplicar(num, num2));


	System.out.println("Numeros capicuas entre 0 y 999 ");
	
	for(int numCapi = 0; numCapi< 999;numCapi++){
		if(matematicas.funciones.capicua(numCapi)){
			System.out.println(numCapi);
		}
    }
    
    int numPri;
    System.out.println("¿Que numero quieres saber si es primo?");
    numPri = Integer.parseInt(System.console().readLine());
    
    if(matematicas.funciones.esPrimo(numPri)){
    System.out.println("El numero " + numPri + " es primo.");
	}else{
	System.out.println("El numero " + numPri + " NO es primo.");
    }
  }
}

	
