public class Ejercicio20_6 {
  public static void main(String [] args) {
  
	//Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
	//agua. La capacidad será indicada por el usuario. La cuba se llenará con una
	//cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
	//pueda admitir. El ancho de la cuba no varía.
	
	int capacidad;
	
		System.out.println("Cuba llena de agua");
		System.out.println("Introduzca la capacidad de la cuba");
		capacidad = Integer.parseInt(System.console().readLine());
	
		for (int i = 0; i < capacidad;i++) {
			System.out.print("*");
			if(i == 0){
				for(int e = 0; e < 4; e++){
					System.out.print(" ");
				}
			}else if (i == (capacidad -1)){
				for(int e = 0; e < 4; e++){
					System.out.print("*");
				}
			}else{
				for(int e = 0; e < 4; e++) {
					System.out.print("~");
				}
			}
			
		System.out.print("*");
		System.out.println(" ");
		}
	
	}
}

