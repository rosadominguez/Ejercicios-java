public class Ejercicio13_7 {
  public static void main(String [] args){
  
	//Escribe un programa que rellene un array de 100 elementos con números enteros
	//aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
	//el programa mostrará el array y preguntará si el usuario quiere destacar el
	//máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
	//el número destacado entre dobles asteriscos.
	
		System.out.println("Maximo y minimo");
	
		int [] numIntro = new int[100];
		int maximo = 0;
		int minimo = 501;
		String respuesta = " ";
	
			for(int i= 0; i < 100;i++){
				numIntro[i] = (int)(Math.random()*501);
				System.out.print(numIntro[i] + " ");
				
					if(numIntro[i] > maximo){
						maximo = numIntro[i];
					}else if (numIntro[i]< minimo){
						minimo = numIntro[i];
					}
			}
			
			System.out.println(" ");
			System.out.println("Indica si quieres destacar el numero maximo o el minimo");
			respuesta =(System.console().readLine());
			
			switch (respuesta) {
			
			case "maximo":
	
				for(int i = 0; i <100;i++){
	
					if (numIntro[i] == maximo){
						System.out.print("**" +numIntro[i] + "** "); 
					}else{
						System.out.print(numIntro[i] + " "); 
					}
				}
				break;
				
			case "minimo":
			
				for(int i = 0; i <100;i++){
					
					if (numIntro[i] == minimo){
						System.out.print("**" + numIntro[i] + "** "); 
					}else{
						System.out.print(numIntro[i] + " "); 
					}
				}
				break;
				
			}
	}
}
