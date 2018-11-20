public class Ejercicio8_7 {
  public static void main(String [] args){
  
	//Realiza un programa que pida la temperatura media que ha hecho en cada mes
	//de un determinado año y que muestre a continuación un diagrama de barras
	//horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
	//de asteriscos o cualquier otro carácter.
	
	System.out.println("Diagrama de temmperaturas medias");
	
	int [] temperatura = new int[12];
	int diagrama = 0;
	
		System.out.println("Por favor, introduce las temperaturas medias de cada mes de año");
		
		for(int i = 0; i <12;i++){
	
			temperatura [i] = Integer.parseInt(System.console().readLine());
		
		}
		
		for(int i = 0;i<12;i++){
			
		for(int j = 0;j < temperatura[i];j++){
			
				System.out.print("=");
			}
			System.out.println(" ");	
		}
	}
}
