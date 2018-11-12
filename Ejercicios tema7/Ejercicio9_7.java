public class Ejercicio9_7 {
  public static void main(String [] args) {
  
	//Realiza un programa que pida 8 números enteros y que luego muestre esos
	//números junto con la palabra par o impar según proceda.
	
	System.out.println("PAR o IMPAR");
	System.out.println("Por favor introduzca 20 numeros enteros,introduzca intro para separar");
	
	int [] numero= new int[20];
	
		for(int i = 0; i <20;i++){
		
			numero[i]=Integer.parseInt(System.console().readLine());
		}
			for(int i = 0; i < 20;i++){
			
				if ( numero[i]%2 == 0){
					System.out.println(numero[i] + " par");
				}else{
					System.out.println(numero[i] + " impar");
				}
			}
		System.out.println(" ");
	}
}
