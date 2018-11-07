public class Ejercicio5_7{
  public static void main(String [] args){

	//Escribe un programa que pida 10 números por teclado y que luego muestre
	//los números introducidos junto con las palabras máximo y mínimo al lado
	//del máximo y del mínimo respectivamente
	
		System.out.println("Máximo y mínimo");
	
		int [] numIntro = new int[10];
		int maximo = 0;
		int minimo = 1000;
	
		System.out.println("Por favor introduzca 10 numeros");
	
			for(int i= 0; i < 10;i++){
				numIntro[i] = Integer.parseInt(System.console().readLine());
				
				if(numIntro[i] > maximo){
					maximo = numIntro[i];
				}else if (numIntro[i]< minimo){
					minimo = numIntro[i];
				}
			}
			
			System.out.println(" ");
	
				for(int i = 0; i <10;i++){
	
					if (numIntro[i] == maximo){
						System.out.println(numIntro[i] + "maximo "); 
					}else if (numIntro[i] == minimo){
						System.out.println(numIntro[i] + "minimo "); 
					}else{
						System.out.println(numIntro[i]); 
					}
				}
	}
}
