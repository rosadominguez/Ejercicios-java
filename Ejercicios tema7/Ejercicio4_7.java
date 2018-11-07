public class Ejercicio4_7{
  public static void main(String [] args) {
  
	//Define tres arrays de 20 números enteros cada una, con nombres numero,
	//cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
	//array cuadrado se deben almacenar los cuadrados de los valores que hay en el
	//array numero. En el array cubo se deben almacenar los cubos de los valores que
	//hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
	//en tres columnas.
	
	System.out.println("    Numeros  Cuadrados      Cubos");
	
	int [] numeros = new int[20];
	int [] cuadrados = new int[20];
	int [] cubos = new int[20];
	

	for(int i = 0; i< 20;i++) {
		numeros[i] = (int)(Math.random()*100);
		cuadrados[i] = numeros[i]*numeros[i];
		cubos[i] = cuadrados[i]*numeros[i];
		System.out.printf("%10d %10d %10d\n",numeros[i],cuadrados[i],cubos[i]);
	}
}
}
		
