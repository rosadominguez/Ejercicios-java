public class Ejercicio6_7{
  public static void main(String[] args){
  
	//Escribe un programa que lea 15 números por teclado y que los almacene en un
	//array. Rota los elementos de ese array, es decir, el elemento de la posición 0
	//debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
	//la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
	//del array.
	
		System.out.println("15 numeros rotados");
	
		int [] numIntro = new int[15];
	
			for(int i= 0; i < 15;i++){
				numIntro[i] = Integer.parseInt(System.console().readLine());
			}
	
			System.out.println(" ");
	
			for(int i = 0;i<15;i++){
		
				if( i == 0){
					System.out.println(numIntro[14]);
				}else{
					System.out.println(numIntro[i - 1]);	
				}
			}
	}
}


