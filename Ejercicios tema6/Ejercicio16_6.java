public class Ejercicio16_6 {
  public static void main(String [] args) {
  
	//Realiza un simulador de máquina tragaperras simplificada que cumpla los
	//siguientes requisitos:
	//a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
	//figuras posibles: corazón, diamante, herradura, campana y limón.
	//b) Si las tres figuras son diferentes se debe mostrar el mensaje Lo siento,
	//ha perdido.
	//c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje Bien,
	//ha recuperado su moneda.
	//d) Si las tres figuras son iguales se debe mostrar Enhorabuena, ha ganado
	//10 monedas.
	
		System.out.println("Maquina tragaperras");
		String figura = " ";
		String figura1=" ";
		String figura2=" ";
		String figura3=" ";
		int tirada;
	  
		for(int i = 0; i < 3; i++){
		  
			tirada = (int)(Math.random()*5)+1;
		
			switch (tirada){
			
				case 1:
				figura = " corazon ";
				break;
			
				case 2:
				figura = " diamante ";
				break;
			
				case 3:
				figura = " herradura ";
				break;
			
				case 4:
				figura = " campana ";
				break;
			
				case 5:
				figura = " limon ";
				break;
		
			}
			
			System.out.print(figura);
		
			switch (i) {
		
				case 0:
				figura1 = figura;
				break;
		
				case 1:
				figura2 = figura;
				break;
		
				case 2:
				figura3 = figura;
				break;
			}	
		}
		
			System.out.println(" ");
			
			if((figura1 == figura2) && (figura2 == figura3) && (figura3 == figura1)) {
				System.out.println("Enhorabuena, ha ganado 10 monedas.");
			} else if ((figura1 != figura2)&&(figura2 != figura3) && (figura3 != figura1)){
				System.out.println("Lo siento, ha perdido.");
			}else {
				System.out.println("Bien, ha recuperado su moneda");
			}
	}
}
