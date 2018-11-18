public class Ejercicio15_7 {
  public static void main(String [] args){
  
	//Un restaurante nos ha encargado una aplicación para colocar a los clientes en
	//sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
	//mesa llena. Cuando llega un cliente se le pregunta cuántos son. De momento
	//el programa no está preparado para colocar a grupos mayores a 4, por tanto,
	//si un cliente dice por ejemplo que son un grupo de 6, el programa dará el 
	//mensaje Lo siento, no admitimos grupos de 6, haga grupos de 4
	//personas como máximo e intente de nuevo. Para el grupo que llega,
	//se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
	//libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
	//grupo es de dos personas, se podrá colocar donde haya una o dos personas.
	//Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
	//vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
	//Los grupos no se pueden romper aunque haya huecos sueltos suficientes.
	
	System.out.println("Restaurante");
	
	int [] mesa = new int[10];
	int comensales =0;
	int total = 0;
	
	
		for (int i= 0; i<10; i++){
			mesa[i] = (int)(Math.random()*5);
		}
		System.out.print("Nº mesa:      ");
				for(int i = 0;i<10;i++){
					System.out.print((i+1) + " "); 
				}
				System.out.println(" ");
				System.out.print("Nº ocupantes: ");
				
				for(int i = 0;i<10;i++){
					System.out.print(mesa[i] + " "); 
				}
			System.out.println(" ");
	
		 do{
			System.out.println("¿Buenas, cuantos sois?(Pulse -1 para salir del programa)");
			comensales = Integer.parseInt(System.console().readLine());
			
			if(comensales != -1){
				
				if(comensales > 4){
					System.out.println("Lo siento,no admitimos grupos de mas de 4 personas.Si quiere haga grupos de 4 o menos y pruebe de nuevo.Gracias.");
				}
				if(comensales<= 4) {
				boolean sentados = false;
					for(int i = 0;((i<10) && (sentados== false));i++){
						if(mesa[i] == 0){
							mesa[i]=comensales;
							System.out.println("Su mesa es la " + (i+1) + ".");
							sentados = true;
						}	
					}
					if(sentados==false){
					
						for(int i = 0;i<10;i++){
						
						total = mesa[i] + comensales;
					
							if((total<=4)&&(sentados==false)){
								mesa[i] = total;
								System.out.println("Su mesa es la " + (i+1) + ".");
								sentados = true;
							}
						}
					if(sentados==false){
						System.out.println("Lo siento, ahora mismo esta todo ocupado.");
					}
					}
			}
	
					System.out.print("Nº mesa:      ");
				for(int i = 0;i<10;i++){
					System.out.print((i+1) + " "); 
				}
				System.out.println(" ");
				System.out.print("Nº ocupantes: ");
				
				for(int i = 0;i<10;i++){
					System.out.print(mesa[i] + " "); 
				}
		
		System.out.println(" ");
	}
	
	}while (comensales !=-1);
		
}		
}


	
