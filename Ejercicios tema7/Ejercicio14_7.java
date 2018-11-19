public class Ejercicio14_7 {
  public static void main(String [] args) {
  
	//Escribe un programa que pida 8 palabras y las almacene en un array. A
	//continuación, las palabras correspondientes a colores se deben almacenar al
	//comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
	//auxiliares como quieras. Los colores que conoce el programa deben estar en
	//otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
	//blanco y morado.
	
	System.out.println("Vamos a  ordenar palabras");
	
	String [] palabras=  new String[8];
	String [] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
	String [] auxi = new String[8];
	int colo=0;

	System.out.println("Por favor, introduzca 8 palabras,pulse intro para separar");
	
		for (int i = 0; i <8;i++){
			palabras[i] = System.console().readLine();
	
			for (String c : color){
				if (palabras[i].equals(c)){
					auxi[colo++] = c;
				}
			}
		}
			for(int i = 0;i<8;i++){
				System.out.printf("%8d |",i+1);
			}
			System.out.println(" ");

			for(int i = 0;i<8;i++){
				System.out.printf("%8s |", palabras[i]);
			}
			System.out.println(" ");

		System.out.println("**********************************************************************");
		
			for ( int i = 0; i < 8;i ++){
				boolean esColor= false;
			
				for(String c :color){
					if(palabras[i].equals(c)){
						esColor = true;
					}
				}
				
				if(!esColor){
				auxi[colo++]= palabras[i];
				}
			}
			
			for(int i = 0;i<8;i++){
				System.out.printf("%8d |",i+1);
			}
			System.out.println(" ");

			for(String a : auxi){
				System.out.printf("%8s |",a);
			}
			System.out.println(" ");		
	}
}
	
	
